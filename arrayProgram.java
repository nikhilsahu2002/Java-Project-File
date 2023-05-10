public class arrayProgram {
    public static void main(String[] args) {
        int []  arr = {5,2,8,1,3,7,9};
        int swap;

        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1 ; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j]=swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int maxEven = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

    for (int num : arr) {
        if (num % 2 == 0) {
            if (num > maxEven) {
                maxEven = num;
            }
            if (num < minEven) {
                minEven = num;
            }
        }
    }

    System.out.println("Maximum even number: " + maxEven);
    System.out.println("Minimum even number: " + minEven);
    
    }

   
    
}
