import java.lang.reflect.Array;

public class SecondLarge {
    
    public void Secondlarge(int a []) {
        int spwipe=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]<a[j+1]){
                    spwipe =a[j];
                    a[j]=a[j+1];
                    a[j+1]=spwipe;
                }
            }
        }         
        System.out.println(a[1]);
    }
    
    public static void main(String[] args) {
        SecondLarge s = new SecondLarge();
        int[] array = {5, 20, 30, 40, 20};
        s.Secondlarge(array);
        
    }
}
