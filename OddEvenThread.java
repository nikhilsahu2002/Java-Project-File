class Even implements Runnable {
    Thread thread1;
    Object lock;

    Even(Object lock) {
        this.lock = lock;
        thread1 = new Thread(this, "Even");
        thread1.start();
    }

    public void run() {
        try {
            synchronized (lock) {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                        lock.notify();
                        lock.wait(); 
                    }
                }
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Odd implements Runnable {
    Thread thread2;
    Object lock;

    Odd(Object lock) {
        this.lock = lock;
        thread2 = new Thread(this, "Odd");
        thread2.start();
    }

    public void run() {
        try {
            synchronized (lock) {
                for (int j = 1; j <= 20; j++) {
                    if (j % 2 == 0) {
                        System.out.println(j);
                        lock.notify();
                        lock.wait(); 
                    }
                }
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        Object lock = new Object(); // Shared lock object
        new Even(lock);
        new Odd(lock);
    }
}
