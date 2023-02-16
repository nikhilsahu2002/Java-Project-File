 import java.util.Scanner;

// Finding Factorial of a Number Given By The User:
public class factoril {
    public static void main(String[] args) {
        long f=1;
        int j=0;
        System.out.print("Enter The Number To Find Factorial Of It :");
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=j; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}
