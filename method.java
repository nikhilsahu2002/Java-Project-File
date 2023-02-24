import org.jetbrains.annotations.Contract;

public class method {
    public static void main(String[] args){

        System.out.println("Please Rate Us ");
        Hello("I Rated You ",5,true);

        System.out.println(sum_num(6,9));
        int[] k ={4,3,9,5,1};
        System.out.println(arr(k));
    }

    public static void Hello(String Message,int rate,boolean status){
        System.out.println(Message + rate + " Stars, Status is " +status );
    }

    public static int sum_num(int x , int y){
        int result = x +y;
            return result;
    }
    @Contract(pure = true)
    public static int arr(int [] a){
        int j=0;
        for (int i = 0; i <a.length ; i++) {
             j = j + a[i];
        }
        return j;
    }
}
