import java.util.Scanner;

// write a program to check wheither the two number are equal or not:
public class compare {
    public static void main(String[] args) {

        System.out.println("Enter The First Number ");
        Scanner scanner =new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter The Second Number ");
        int num2 = scanner.nextInt();

        scanner.close();

        if (num1 > num2 ) {
            System.out.println("First Number is Greater Then Second");
        }
        else if (num1<num2) {
            System.out.println("First Number Is Smaller Then Second ");
        } else {
            System.out.println("Both are Equal");
        }
        
    }
}
