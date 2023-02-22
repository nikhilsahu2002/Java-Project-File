public class reverse_string {
    public static void main(String[] args) {
        String N = "hello Nikhkl";
        String M ="";

        char [] arr =N.toCharArray();

        for (int i = arr.length -1; i >= 0; i--) {
            M += arr[i];
        }

        System.out.println(M);
    }
}
