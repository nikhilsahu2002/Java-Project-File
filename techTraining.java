// import java.sql.Array;
// import java.util.ArrayList;
import java.util.Scanner;

public class techTraining {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int []  arr = new int[10];
    int k=0;
    int []  arr3 = new int[10];
    for (int i = 0; i < 10; i++) {
        arr[i] = scan.nextInt();
    }
    scan.close();

    BUBBLE_Sort.Bubble(arr);

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            arr3[k] = arr[i];
            k++;
        }
    }
    for (int i : arr3) {
        System.out.println(i);
    }
}    
}
