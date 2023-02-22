public class reverse {
    public static void main(String[] args) {
        int [] arr = {2,6,8,9,4,2,5,8};

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] =temp;
        }
        
        
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);    
        }
        
    }

}
