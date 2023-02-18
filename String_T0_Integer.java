import java.util.Scanner;

public class String_T0_Integer {
    public static void main(String[] args) {

        System.out.println("Enter The Number As String");
        Scanner scanner= new Scanner(System.in);
        String m= scanner.next();
        

        System.out.println("Enter The Second Number As String");
        String n =scanner.next();

        int i =Integer.parseInt(m);
        int j =Integer.parseInt(n);

        scanner.close();
        System.out.print("The Sum Of Two Number ");
        System.out.println(  i + j);

        // converting a int into a string :

        String k = String.valueOf(i);
        String l = String.valueOf(j);

        System.out.println("The String Form Convertion will look like that " + k+l);

        
    }
    
}
