import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Vector<Integer> list = new Vector<>();

        // int length = arr.length;
        for (int index = 0; index < arr.length; index++) {
            list.addElement(arr[index]);
        }

        list.insertElementAt(5, 2);
        // list.remove(1);
        int size = list.size();

        int[] listarr = new int[size];

        for (int i = 0; i < size; i++) {
            listarr[i] = list.elementAt(i);
        }

        System.out.println("list of languages");

        for (int i = 0; i < size; i++) {
            System.out.println(listarr[i]);
        }

    }
}
