import java.math.BigInteger;

public class recusion {
    public static void main(String[] args) {
        // SayHello(5);
        int n = CalculatePower(2, 5);
        System.out.println(n);
        System.out.println(Fact(5));
        // factorial();
       recusion obj = new recusion();
       for (int i = 0; i < 5; i++) {
            System.out.println(obj.Feb(i));
       }
        
    }

    public static void SayHello(int n) {
        if (n==0) {
            System.out.println();
        }
        else{
            System.out.println("Hello ");
            SayHello(n-1);
        }
    }

    public static int CalculatePower(int x ,int y) {
        if (y==0) {
            return 1;
        }
        else return x * CalculatePower(x,y-1);        
    }

    public static int Fact(int n ) {
        if (n==0) {
            return 1;
        }
        else{
            return n * Fact(n-1);
        }
        
    }

    public static void factorial() {
        int n = 500;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

    public int Feb(int n ) {
        if (n==0) {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Feb(n-1) + Feb(n-2);
        }
    }
}
