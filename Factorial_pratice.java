import java.util.Scanner;

class Factorial {
    int n;
 
    Factorial(int num) {
        n = num;
    }
    
    int factorial(int n){
        if (n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}

class Fibonacci extends Factorial {
    Fibonacci(int num) {
        super(num);
    }
    
    int fibonacci(int num){
        if (num == 0) {
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        return fibonacci(num-2) + fibonacci(num-1);
    }
}

class Factorial_practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k=scan.nextInt();
        scan.close();
    
        Fibonacci f = new Fibonacci(k);
        int result = f.factorial(k);
        System.out.println(result);

        for (int i = 0; i <= k; i++) {
            System.out.print(f.fibonacci(i) + " ");
    }
}
}
