// import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        int [] arr = {5,2,6,4,9,3};
        int v=56,count=1;
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]!=v && flag==0) {
                count++;
                // flag=0;   
            }
            if (arr[i]==v) {
                break;
            }

        }
            
        System.out.println(count);
        
        // System.out.println("Prime Number :" + Primenumber);
    }
}
