public class heapsort {
    public void sort(int arr[]){
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
     void heapify(int arr[],int n,int i){
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

    public static void main(String[] args) {
        int [] arr= {2,5,9,6,0};
        heapsort obj = new heapsort();
        obj.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}