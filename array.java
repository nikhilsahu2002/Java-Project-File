import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] arr = new int[10];

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] =scanner.nextInt(); 
        }
        scanner.close();   

        char[] arr1 = new char[10];
        Scanner scan = new Scanner(System.in);
        scan.next().charAt(0);
        scan.close();
    }
}
