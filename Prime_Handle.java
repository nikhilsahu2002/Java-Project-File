import java.util.Scanner;

class NikhilException extends Exception {
    public NikhilException(String message) {
        super(message);
    }
}

class PrimeChecker implements Runnable {
    private int number;
    private int threadNumber;

    public PrimeChecker(int number, int threadNumber) throws NikhilException {
        if (number < 2) {
            throw new NikhilException(number + " is not Prime");
        }
        this.number = number;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
            checkPrime(number);
            System.out.println("Thread " + threadNumber + ": " + number + " is Prime");
        } catch (NikhilException e) {
            System.out.println("Thread " + threadNumber + ": " + e.getMessage());
        }
    }

    private static void checkPrime(int number) throws NikhilException {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                throw new NikhilException(number + " is not Prime");
            }
        }
    }
}

public class Prime_Handle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean validNumber = false;
        while (!validNumber) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number <= 10) {
                validNumber = true;
            } else {
                System.out.println("Number greater than 10. Please try again.");
            }
        }

        Thread[] threads = new Thread[number];
        try {
            for (int i = 0; i < number; i++) {
                threads[i] = new Thread(new PrimeChecker(number, i + 1));
                threads[i].start();
            }
        } catch (NikhilException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
