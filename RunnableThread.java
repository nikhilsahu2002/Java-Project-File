class FirstThread implements Runnable{
    Thread thread1;
    public FirstThread() {
        thread1 = new Thread(this,"FirstThread");
        thread1.start();
    }
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread 1 : " + i + ":");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Exist Due To Intrupte ");
        }
    }
}

class SecondThread implements Runnable{
    Thread thread2;
    public SecondThread() {
        thread2 = new Thread(this,"FirstThread");
        thread2.start();
    }    
    public void run() {
        System.out.println("Thread Name : " + thread2.getName());
        System.out.println("Thread Priorty : " + thread2.getPriority());
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread 2 : " + i + " : ");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Exist Due To Intrupte");
        }   
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        new FirstThread();
        new SecondThread();

        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Main Thread : " + i + " : ");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Exist Due To Intrupte ");
        }
    }
}
