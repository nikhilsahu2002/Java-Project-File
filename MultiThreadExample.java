class first_thread extends Thread{
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("thread 1 : " + i + " : ");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("thread 1 intrupted");
            System.out.println("Exist From Thread1");
        }
    }
}
class second_thread extends Thread{
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("thread 2 : " + i + " : ");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 Intrupted");
            System.out.println("Exist From Thread2");
        }
    }
}

public class  MultiThreadExample {
    public static void main(String[] args) {
        first_thread obj1 = new first_thread();
        second_thread obj2 = new second_thread();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Thread Final :" + i + " : ");
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            System.out.println("main Thread Intrupted");
            System.out.println("Exiting From Main Thread");
        }
        thread2.start();
    }
}
