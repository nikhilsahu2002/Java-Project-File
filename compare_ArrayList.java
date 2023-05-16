import java.util.*;

public class compare_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> List = new ArrayList<>();
            List.add(14);
            List.add(15);
            List.add(20);

            System.out.println(List.get(1).compareTo(List.get(2)));
    }
}