class StackOverfolwException extends Exception{
    public String toString(){
        return "StackOverflowException";
    }
}

class StackUnderflowException extends Exception{
    public String toString(){
        return "StackUnderflowException";
    }
}

class Stack{
    int arr[]=new int[5];

    int ptr=-1;

    public void push(int x) throws StackOverfolwException
    {
        ptr++;
        if(ptr>2) throw new StackOverfolwException();

        arr[ptr] = x;
        System.out.println(ptr+ " " +arr[ptr]);
    }

    public void pop() throws StackUnderflowException
    {
        if(ptr<0) throw new StackUnderflowException();

        arr[ptr--]=-1;
    }
}


public class SC1 {
    public static void main(String[] args) throws Exception
    {
        Stack s=new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
    }
}
