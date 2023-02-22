public class avg_into_array {
    public static void main(String[] args) {
        int [] arr = new int[] {5,5,5,5,5};
        int sum=0;
        double Avg =0d;
        for (int e : arr) {
            sum = sum + e;
        }

        Avg = sum/arr.length;
        
       
        System.out.println(Avg);
    }
}