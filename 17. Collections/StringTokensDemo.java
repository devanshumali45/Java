import java.util.StringTokenizer;

public class StringTokensDemo {
    public static void main(String[] args) {
        String str="Hello, I' m\"Devanshu\"_Mali !! Yoo";

        StringTokenizer skt=new StringTokenizer(str,",'@_! ");

        String s;
        while(skt.hasMoreTokens()){
            s=skt.nextToken();
            System.out.println(s);
        }
    }
}
