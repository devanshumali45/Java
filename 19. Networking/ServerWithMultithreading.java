import java.net.*;
import java.io.*;

public class ServerWithMultithreading extends Thread

    {
        Socket stk;
        
        public ServerWithMultithreading(Socket st)
        {
            stk=st;
        }
        public void run()
        {
            try{
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps=new PrintStream(stk.getOutputStream());
            
            String msg;
            StringBuilder sb;
            do
            {
                msg=br.readLine();
                
                sb=new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();
                
                ps.println(msg);
                
            }while(!msg.equals("dne"));
            
            stk.close();
            }catch(Exception e){}
            
        }
                
        public static void main(String[] args) throws Exception
        {
            ServerSocket ss=new ServerSocket(2000);
            int count=1;
            Socket stk;
            ServerWithMultithreading re;
            do
            {
            stk=ss.accept();
            System.out.println("Client Connected :"+count++);
            re=new ServerWithMultithreading(stk);
            re.start();
            
            }while(true);
            
        }    
    }    


