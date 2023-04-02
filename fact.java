import java.util.Scanner;

// import java.util.Scanner;

public class fact {
    static long Fact(long n){
        if (n<=0) {
            return 1;
        }
        return fact.Fact(n-1)*n ;
}


    public static void main(String[] args) {
        long n;
            Scanner s = new Scanner(System.in);
            String k = s.next();
            n = Long.parseLong(k);
            s.close();
            long f = fact.Fact(n);
                System.out.println("factorial= " + f);
            }
    
}