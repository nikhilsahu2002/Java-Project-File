public class HCF_LCM {
    public static int HCF(int a,int b) {
        int k=a<b?a:b;
        int hcf=0;
        for (int i = 1; i < k; i++) {
            if (a%i==0 && b%i==0) {
                 hcf=i;
            }
        }
        return hcf;
    }
    
    public static int LCF(int num1,int num2) {
        int lcf=num1*num2/HCF(num1, num2);
        return lcf;
    }
    public static void main(String[] args)  {
        System.out.println(HCF(20, 24));
        System.out.println(LCF(20, 30));
    }
}
