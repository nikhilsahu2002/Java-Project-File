/**
 * Factorial_pratice
 */

class fact {
    int n;
    fact(int num){
        n=num;
    }
    int Fact(int n){
        if (n==0) {
            return 1;
        }
        return n*Fact(n-1);
    }
}

class feb extends fact{
    feb(int num) {
        super(num);
    }
    int Feb(int num){
        if (num==0) {
            return 0;
        }
        else if (num==1){
            return 1;
        }
        return Feb(num-2) + Feb(num-1);
    }
}
class Factorial_pratice {
    public static void main(String[] args) {
        feb f = new feb(5);
        f.Fact(5);
        
    }
    
}