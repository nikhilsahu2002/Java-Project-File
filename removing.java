//  import java.text.BreakIterator;
import java.util.Scanner;



public class removing {
    public static void main(String[] args) {
        int [] arr ={5,3,4,8,9,14,12,56};
        int k=0;

        System.out.print("Enter The Value That You Want TO Remove : ");
        Scanner scanner =new Scanner(System.in);
        int j =scanner.nextInt();
        scanner.close();
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (j==arr[i]) {
                 k=i;
                }
            else
            {
                flag = 1;
            }

        }
        
    if (flag == 0) {
        
    
        //removing a element with index value
        int value = k;

        for (int i = value; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("After Removing Element");
        for (int i = 0; i < arr.length -1; i++) {
            System.out.println(arr[i]);
        }
    } else {
        System.out.println("Can not be Find");  
    }
    }
}
