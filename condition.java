import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        int i=0;

        System.out.println("Enter The Number");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.close();
        if (i<5) {
            System.out.println("condion 1");
        }
        else if (i>5) {
            System.out.println("condition 2");
        } else {
            System.out.println("condition 3");
        }
    }
}
