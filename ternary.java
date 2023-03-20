import java.util.Scanner;

public class ternary {
    public static void main(String [] args){
        System.out.println("Enter The Number");
        Scanner number = new Scanner(System.in);
        int num =number.nextInt();
        number.close();
        String output=(num %2==0)?"even number":"odd number";
        System.out.println(output);

    }

}
