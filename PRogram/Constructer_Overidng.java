class rec {
    int br, len;

    rec() {
        br = 10;
        len = 20;
    }

    rec(int l) {
        br = l;
        len = l;
    }

    rec(int l, int b) {
        br = b;
        len = l;
    }
    public int Area() {
        return br +len;
    }
}

public class Constructer_Overidng {
    public static void main(String[] args) {
        rec obj1 = new rec();
        rec obj2 = new rec(100);
        rec obj3 = new rec(40, 20);
        System.out.println(obj1.Area());
        System.out.println(obj2.Area());
        System.out.println(obj3.Area());
    }

}