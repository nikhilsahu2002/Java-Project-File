public class Duplicate {
    public static void main(String[] args) {
        int [] arr ={2,5,4,5,4,3,6,7,3};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                    count++;
                }
            }
             System.out.println(count);
        }
    }
}
