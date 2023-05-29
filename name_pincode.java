import java.util.Scanner;

public class name_pincode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        int[] pincode = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name " + (i + 1) + ": ");
            String inputName = scanner.nextLine();
            name[i] = inputName;

            System.out.print("Enter the pincode " + (i + 1) + ": ");
            int inputPincode = scanner.nextInt();
            pincode[i] = inputPincode;
            scanner.nextLine(); // Consume the newline character
        }

        System.out.print("Enter the pincode to search: ");
        int searchPincode = scanner.nextInt();

        for (int i = 0; i < pincode.length; i++) {
            if (searchPincode == pincode[i]) {
                System.out.println("Name: " + name[i]);
            }
        }

        scanner.close();
    }

}
