import java.util.Scanner;

public class end_of_line {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(scan.hasNextLine()){
            i++;
            System.out.println(i+" " + scan.nextLine());
        }
        scan.close();
    }
}