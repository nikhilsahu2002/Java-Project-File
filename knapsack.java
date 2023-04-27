public class knapsack {
    public static void main(String[] args) {
        double [] arr= {1,2,3,4,5};
        double [] profit = {2,28,25,18,9};
        double [] weight = {1,4,5,3,3};
        double [] p_w =new double[5];
        double m = 15;
        double p=0;

        for (int i = 0; i < arr.length; i++) {
          p_w[i] = profit[i]/weight[i];
        }

        // bubble sort
        for (int i = 0; i < p_w.length - 1; i++) {
            for (int j = 0; j < p_w.length - i - 1; j++) {
                if (p_w[j] < p_w[j + 1]) {
                    double temp = p_w[j];
                    p_w[j] = p_w[j + 1];
                    p_w[j + 1] = temp;

                    temp = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = temp;

                    temp = profit[j];
                    profit[j] = profit[j + 1];
                    profit[j + 1] = temp;
                }
            }
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
}
