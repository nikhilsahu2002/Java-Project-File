import java.util.Iterator;
import java.util.Vector;

public class Midchar {

    public static void Middle_Element(String s) {
        System.out.println(s.charAt(s.length()/2));
    }

    public static boolean areConsecutive(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        return (max - mid == 1 && mid - min == 1);
    }

    public static void Student() {
        Vector<String> studVector = new Vector<>();
        studVector.add("Nikihl");
        studVector.add("Sagar");
        studVector.add("Avinash");

        Iterator<String> iterator = studVector.iterator();
        while (iterator.hasNext()) {
    
            String obj = iterator.next();
            System.out.println(obj);
    
            System.out.println(iterator.next());
        }

        for (String string : studVector) {
            System.out.println(string);
        }
    }
    
    public static void main(String[] args) {
        Middle_Element("nikhil");
        System.out.println(areConsecutive(10, 11, 12));
        Student();
    }
}
