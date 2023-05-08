class MaxPriority implements Runnable{
    Thread thread1;
    MaxPriority(){
        thread1 = new Thread(this,"MaxPriority");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
    }
    public void run() {
        System.out.println("Max Thread Detail");
        System.out.println("Thread Name : " + thread1.getName());
        System.out.println("Thread Priorty : "+thread1.getPriority());
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("thread  1  : " + i );
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Exist Due To itruption");
        }
    }
}

class MinPriority implements Runnable{
    Thread thread2;

    public MinPriority()  {
        thread2 = new Thread(this,"MinPriority");
        thread2.setPriority(Thread.MIN_PRIORITY + 2 );
        thread2.start();
    }
    public void run() {
        System.out.println("Thread Details");
        System.out.println("Thread Name : " + thread2.getName());
        System.out.println("Thread Priority : " + thread2.getPriority());
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("thread 2  : " + i );
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Exist Due To Intrupeted In thread");
        }
    }
}

public class Priority {
    
    public static void main(String[] args) {
        new MaxPriority();
        new MinPriority();
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Main Thread : " + i );
                Thread.sleep(600);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
