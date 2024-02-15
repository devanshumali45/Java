class MyData{
    int value;
    boolean flag=true;

    synchronized public void set(int v){
        while(!flag){
            try{
                wait();
            }catch(Exception ignored){}
        }
        value=v;
        flag=false;
        notify();
    }

    synchronized public int get(){
        while(flag){
            try{
                wait();
            }catch(Exception e){}
        }
        flag=true;
        notify();
        return value;
    }
}

class Producer extends Thread{
    MyData myData;
    public Producer(MyData data){
        this.myData = data;
    }

    public void run(){
        int ct=1;
        while(ct<10){
            myData.set(ct);
            System.out.println("Producer Produce " + ct);
            ct++;
        }
        myData.set(-1);
    }
}

class Consumer extends Thread{
    MyData myData;
    public Consumer(MyData data){
        this.myData = data;
    }

    public void run(){
        int value=0;
        while(true){
        value=myData.get();
        if(value==-1) break;
        System.out.println("Consumer Consume "+value);
        }
    }
}
public class Test {

    
    public static void main(String[] args) {
        MyData d=new MyData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);

        p.start();
        c.start();

    }
    
}
