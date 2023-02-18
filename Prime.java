import java.util.Scanner;

public class Prime {
    public static void main() {
        
        System.out.println("Enter Range Of A Number ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        scanner.close();

        int count =0 ;
        String Primenumber ="";

        for (int i = 1; i <=j; i++) {
            for ( j = i; j >=1 ; j--) {
                
                if (i%j==0) {
                    
                    count ++;
                }
            }
            if (count ==2) {
                Primenumber = Primenumber + i +"" ; 
            }
            
        }
        System.out.println("Prime Number :" + Primenumber);
    }
}
