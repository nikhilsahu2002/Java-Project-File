import java.util.Scanner;
public class switch_loop {
    public static void main() {
        int i = 0;
        System.out.println("Enter The Number");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        scanner.close();

        switch (i) {
            case 1:
                System.out.println("Condition 1");
                break;

            default:
                System.out.println("Condition Over");
                break;
        }
    }
}
