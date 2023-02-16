import java.util.Scanner;

public class Coding_challenge1 {
    public static void main(String[] args) {

        float h;
        float w;
    
        System.out.println("Enter The Weight in Kilogrames");
        // scanner have to make a once in class
        Scanner scanner = new Scanner(System.in);
        w = scanner.nextFloat();
        
        System.out.println("Enter The Height in Meter");
        h = scanner.nextFloat();

        scanner.close();
        float bmi = w/(h*h);

        System.out.println("BMI = "+bmi);
    }
}
