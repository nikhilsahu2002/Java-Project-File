class NotDivisableExaecption extends Exception {
    public NotDivisableExaecption(String message) {
        super(message);
    }

}

public class DivideException {
    public static void checkExeption(int number) throws NotDivisableExaecption {
        if (number %9 !=0) {
            throw new NotDivisableExaecption(number + " Number Can not Be Divisable By 9");
        }
        System.out.println("Number is Divisable");
    }   

    public static void main(String[] args) {
        try {
            checkExeption(10);
        } catch (NotDivisableExaecption obj) {
            // TODO: handle exception
            System.out.println(obj.getMessage());
        }
    }
}
