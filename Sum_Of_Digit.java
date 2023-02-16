import java.util.Scanner;
// calculating the sum of a digite
public class Sum_Of_Digit {
    public static void main(String[] args) {
        int sum=0;
        System.out.print("Enter The Number :");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        while (num!=0) {
            sum += num%10;
            num =num/10;
        }
        System.out.println(sum);
    }
}
