import java.util.*;

public class WrapperArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);// boxing and unboxing 
        System.out.println(list);

        // boxing an automatic convertion from primetive data to a wrapper object of appropite type 
        int x = list.get(0); // unboxing conversion from a Wrapped Object to its corresponding 
        //primitive data 
        System.out.println(x);
    }
}