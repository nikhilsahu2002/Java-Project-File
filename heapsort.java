public class heapsort {
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = n/2-1; i >=0; i--) {
            heapify(arr, n,i);
        }
        for (int i = n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }
    static void heapify(int arr[],int n,int i){
        int largest = i;
        int l = 2 *i + 1 ;
        int r = 2*i + 2;
        if (l<n && arr[l]<arr[largest]) {
            largest =l;
        }
        if (r<n && arr[r]<arr[largest]) {
            largest =r;
        }

        if(largest!=i){
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
        }
    
    }
    static int deleteRoot(int arr[],int n ){
        int max_element = arr[n-1];
        arr[0] = max_element;
        n=n-1;
        heapify(arr, n, max_element);
        return max_element;
    }

    static void interchange(int arr[] ,int i, int n){
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==i) {
                arr[j]=n;
            }
            heapify(arr, n, 0);
        }
        
    }

    public static void main(String[] args) {
        int [] arr= {2,5,9,6,0};
        heapsort.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
