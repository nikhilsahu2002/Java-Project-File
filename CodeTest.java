

public class CodeTest {
    public static void main(String[] args) {
        point center = new point(5,5);

        circle c1 = new circle(center,10);
        circle c2 = new circle(5, 5, 10);


        System.out.println(c1.CalculateArea());
        System.out.println(c2.CalculateArea());
    }
}
