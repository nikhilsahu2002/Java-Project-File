import java.util.ArrayList;

import java.util.Iterator;

public class ArrayList_CodeTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("nikhil");
        list.add("sagar");
        // adding element at specific place 
        
        list.add(2,"rahul");
        list.add(3,"TT");
        list.add(0,"Avinash");
        // System.out.println(list);
        list.remove(2);

        // change an element in ArrayList
        list.set(0, "99");
        // System.out.println(list);
        list.remove("rahul");
        // System.out.println(list);

        // Itration in arraylist 
        // using for loop

        // for (int index = 0; index < list.size(); index++) {
        //     System.out.println(list.get(index));
        // }
        // System.out.println("\n");
        // //using foreach loop 
        // for (String S : list) {
        //     System.out.println(S);
        // }

        // using Itrator interface 
        Iterator<String> iterator = list.iterator(); 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
