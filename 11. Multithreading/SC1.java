class Atm{
    synchronized public void checkBalance(String name){
        System.out.println("Checking balance of "+name+"...");
    }

    synchronized public void withdraw(String name,int amount){
        System.out.println("Withdrawing "+amount+ " from "+name +"'s account...");
    }
}

class Customer extends Thread{
    Atm a;

    String name;
    int amount;

    public Customer(Atm a,String name,int amount){
        this.name = name;
        this.amount = amount;
        this.a = a;
    }

    public void operation(){
        a.checkBalance(name);
        a.withdraw(name, amount);
        
    }

    public void run(){
        operation();
    }
}

public class SC1 {
    public static void main(String[] args) {
        Atm a = new Atm();
        Customer c1 = new Customer(a,"Abhi",5000);
        Customer c2 = new Customer(a,"Rushi",10000);

        c1.start();
        c2.start();

    }
}
