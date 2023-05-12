class Callme {
    public void call(String msg) {
        System.out.println('[' + msg + ']');
    
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Leave Due To Some Error Accured");
        }
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    
    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

public class Sync {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller("Hello", target);
        Caller obj2 = new Caller("Synchronized", target);
        Caller obj3 = new Caller("World", target);
        
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }  
}
