import java.util.Scanner;

public class Elsif_ladders {
    public static void main(String[] args){
        System.out.println("Enter The Marks");
        Scanner k = new Scanner(System.in);        
        int mark =k.nextInt();
        k.close();

        if (mark<50) {
            System.out.println("fail");
        } 
        else if(mark>=50 && mark <60) {
            System.out.println("D Grade");
        }
        else if(mark>=60 && mark< 70){
            System.out.println("C Grade");
        }
        else if(mark>=70 && mark<80){
            System.out.println("B Grade");
        }
        else if(mark>=80 && mark<90){
            System.out.println("A Grade");
        }
        else{
            System.out.println("O Grade");
        }
    }
}
