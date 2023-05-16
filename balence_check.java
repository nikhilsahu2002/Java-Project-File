import java.util.Scanner;

class balence_check_Exception extends Exception{
    public balence_check_Exception(String msg) {
        super(msg);
    }
}

public class balence_check {
    public static void Balence(int number,String s) throws balence_check_Exception {
        if (number <1500) {
            throw new balence_check_Exception("Name :" + s + " And Balence is : " + number);
        }
        System.out.println("Balance Is Greater Then 1500");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        scan.close();

        try {
            Balence(k,s);
        
        } catch (balence_check_Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
