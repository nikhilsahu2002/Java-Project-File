class Addition{
    int a = 10;
    int b =20;

    public void sum() {
        int c ;
        c = a + b;
        System.out.println("Addition : " + c);
    }
}


public class pro1 {
public static void main(String[] args) {
    Addition obj = new Addition();
    obj.sum();
}
    
}