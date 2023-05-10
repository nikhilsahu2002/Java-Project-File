class AsciiThread extends Thread{
    public void run() {
        try {
            for (int i = 65; i < 91; i++) {
                System.out.println("Ascii Value : " + i);
                Thread.sleep(600);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class AlphaBaticalThread extends Thread{
    public void run() {
        try {
            for (int i = 65; i < 91; i++) {
                Thread.sleep(599);
                System.out.println("Alphabate : " + (char)i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class AlphaThread extends Thread {
    public static void main(String[] args) {
        AsciiThread obj1 = new AsciiThread();
        AlphaBaticalThread obj2 = new AlphaBaticalThread();

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
    
}
