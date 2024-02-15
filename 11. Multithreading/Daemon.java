class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count+++" MyThread");
            
        }
    }
}

public class Daemon {
    public static void main(String[] args)throws Exception{
        MyThread t=new MyThread();
        t.setDaemon(true);  //Make thread t as daemon thread
        t.start();

        // Thread mainThread=Thread.currentThread();
        // mainThread.join();

        int count=1;
        while(true)
        {
            System.out.println(count+++" Main");
            Thread.yield(); //Give more time to other threads to avoid starvation

        }




        // try{ main thread wait for 100 milliseconds to end.
        //     Thread.sleep(100);
        // }
        // catch(Exception e){
        // }
    }
}
