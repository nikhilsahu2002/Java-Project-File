public class selection {
    public static void main(String[] args) {
        int [] arr ={5,9,4,2,1,6,2,8};
        
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length/2; j++) {
                if (arr[j] < arr[min]) {
                     min =j;
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            for (int j = arr.length/2; j > i; j--) {
                if (arr[j] > arr[min]) {
                     min =j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
