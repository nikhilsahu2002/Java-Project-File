import java.util.Scanner;

public class leap_years {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("LEAP YEAR");
        }
        else
        {System.out.println("COMMON YEAR");
    }
    }
}
