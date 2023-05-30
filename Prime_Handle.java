import java.util.Scanner;

class Nikhil extends Exception {
    public Nikhil(String message) {
        super(message);
    }
}

public class Prime_Handle {
    public static void CheckPrime(int number) throws Nikhil {
        if (number < 2) {
            throw new Nikhil("Not Prime: " + number);
        }
        
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                throw new Nikhil("Not Prime: " + number);
            }
        }
        
        System.out.println("Number Is Prime");
    }
    
    public static void main(String[] args) {
        System.out.println("Enter The Prime Number ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        try {
            CheckPrime(number);
        } catch (Nikhil e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
