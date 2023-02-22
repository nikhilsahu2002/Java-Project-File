public class max_min {
    public static void main(String[] args) {
        int [] arr = {5,7,6,15,56,78,54,42};
        int max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++) {
          
                if (arr[i]<min) {
                    min = arr[i];    
                }
                if (arr[i]>max) {
                    max = arr[i];
                }
            }
            System.out.println("The Min Value Is " +min);
            System.out.println("The Max Value Is " +max);
        }
    
    }

