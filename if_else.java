import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int num = s.nextInt();
       s.close();
        int a= 18; 
        if(num>=0){
            if(num==30){
                System.out.println("Not Elegible");
            }
            else{
                if (a<num) {
                    System.out.println("Elegible");
                }
                else
                    System.out.println("Not Elegible");
            }
            
        }
        else{
            System.out.println("Enter The Valid Age");
        }
        }
        
}
