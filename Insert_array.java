public class Insert_array {
    public static void main(String[] args) {
        
        int [] arr= {5,6,8,9,2};
        int index = 2;

        for (int i = arr.length-1; i > index; i--) {
            arr[i]= arr[i-1];
        }

        arr[index] = 99;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
