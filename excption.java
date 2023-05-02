public class excption {
    public static void main(String[] args) {
        int x=500;
        try{
            if (x<500) {
                //System.out.println("Pass");
                x=1000;
            }
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("balance is not avalabel");
        }
        
        System.out.println(x);
    }
}
