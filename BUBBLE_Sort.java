public class BUBBLE_Sort {

    public static void Bubble(double[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    double temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    //    for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i] + " ");
    //    }
    }
    public static void main(String[] args) {
        double[] arr={5,3,9,4,2};  
        Bubble(arr);

    }
}
