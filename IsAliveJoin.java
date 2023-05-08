public class IsAliveJoin extends RunnableThread {
    public static void main(String[] args) {
    FirstThread obj1 = new FirstThread();
    SecondThread obj2 = new SecondThread();
    System.out.println(obj1.thread1.isAlive());
    System.out.println(obj2.thread2.isAlive());

    try {
        obj1.thread1.join();
        obj2.thread2.join();
    } catch (Exception e) {
        // TODO: handle exception
    }
    }
}
