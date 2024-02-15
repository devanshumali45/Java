class MyData{
    int value;
    boolean flag=true;
    synchronized public void set(int x){
        while(flag!=true) {
        try{wait();}catch(Exception e){}
        }
        value = x;
        flag=false;
        notify();
    }

    synchronized public int get(){
        int x=0;
        while(flag!=false) {
            try{wait();}catch(Exception e){}
            }
        x=value;
        flag=true;
        notify();
        return x;
    }
}

class  Producer extends Thread{
    MyData myData;

    public Producer(MyData d){
        myData = d;
    }

    public void run(){
        int ct=1;

        while(true){
            myData.set(ct);
            System.out.println("Producer "+ct);
            ct++;
        }
    }
}

class  Consumer extends Thread{
    MyData myData;

    public Consumer(MyData d){
        myData = d;
    }

    public void run(){
        int value;

        while(true){
            value=myData.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class Communication {
    public static void main(String[] args) {
        MyData data=new MyData();

        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();
    }
}
