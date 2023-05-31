public class knapsack {
    public static void main(String[] args) {
        double [] arr= {1,2,3};
        double [] profit = {25,15,10};
        double [] weight = {18,15,10};
        double [] p_w =new double[3];
        double m = 20;
        double p=0;

        for (int i = 0; i < arr.length; i++) {
          p_w[i] = profit[i]/weight[i];
        }

        // Heap Sort
        for (int i = p_w.length / 2 - 1; i >= 0; i--)
            heapify(p_w, weight, profit, p_w.length, i);

        for (int i = p_w.length - 1; i > 0; i--) {
            double temp = p_w[0];
            p_w[0] = p_w[i];
            p_w[i] = temp;

            temp = weight[0];
            weight[0] = weight[i];
            weight[i] = temp;

            temp = profit[0];
            profit[0] = profit[i];
            profit[i] = temp;

            heapify(p_w, weight, profit, i, 0);
        }
        

        // for (double i : p_w) {
        //     System.out.println(i);
        // }

        for (int i = 0; i < p_w.length; i++) {
            if(m>0 && weight[i]<= m){
                m=m-weight[i];
                p=p+profit[i];
            }
            else {
                p=p + (profit[i]/weight[i] )* m;
                break;
            }
        }
        System.out.println(p);
    }

    static void heapify(double arr[], double weight[], double profit[], int n, int i) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 

        if (l < n && arr[l] < arr[largest])
            largest = l;

        if (r < n && arr[r] < arr[largest])
            largest = r;

        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            swap = weight[i];
            weight[i] = weight[largest];
            weight[largest] = swap;

            swap = profit[i];
            profit[i] = profit[largest];
            profit[largest] = swap;

            heapify(arr, weight, profit, n, largest);
        }
    }
}
