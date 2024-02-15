class Counter {
    private int count;
    private boolean canIncrement = true;

    public synchronized void increment() {
        while (!canIncrement) {
            try {
                wait();
            } catch (Exception e) {}
            //     Thread.currentThread().interrupt();
            // }
        }
        count++;
        System.out.println("Incremented: " + count);
        canIncrement = false;
        notifyAll();
    }

    public synchronized void decrement() {
        while (canIncrement) {
            try {
                wait();
            } catch (Exception e) {}
            //     Thread.currentThread().interrupt();
            // }
        }
        count--;
        System.out.println("Decremented: " + count);
        canIncrement = true;
        notifyAll();
    }
}

class Increment extends Thread {
    private final Counter counter;

    public Increment(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

class Decrement extends Thread {
    private final Counter counter;

    public Decrement(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.decrement();
        }
    }
}

public class Multi1 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Increment(counter).start();
        new Decrement(counter).start();
    }
}
