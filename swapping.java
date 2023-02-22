import java.util.Scanner;

public class swapping {
    public static  void  main(String args[]){

        int[] h =new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int k = 0; k <h.length; k++) {
            h[k] = scanner.nextInt();
        }
        scanner.close();
        for (int k = 0; k <h.length ; k++) {
             sum += h[k];
        }

        System.out.println(sum);

//            System.out.println("First Number " +i +" & " +"Second Number "+j);
//        temp = i;
//        i=j;
//        j=temp;
//            System.out.println("Value After Swapping :");
//            System.out.println("First Number " +i +" & " +"Second Number " +j);
    }
}
