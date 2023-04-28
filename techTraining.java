import java.util.Scanner;

public class techTraining {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double []  arr = new double[10];
    int k=0;
    double []  arr3 = new double[10];
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
    for (double i : arr3) {
        System.out.println(i);
    }
}    
}