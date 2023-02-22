public class count {
    public static void main(String[] args) {
        String s ="hello master nikhil 3000 $";
        
        char [] A =s.toCharArray();
        int digit=0,space=0,letter=0,other=0;
        for (int i = 0; i < A.length; i++) {
            if (Character.isDigit(A[i])) {
                digit++;
            } else if(Character.isLetter(A[i])) {
                letter++;
            }
            else if(Character.isWhitespace(A[i])){
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("Digit " +digit);
        System.out.println("space " +space);
        System.out.println("letter " +letter);
        System.out.println("other " +other);
    }
}
