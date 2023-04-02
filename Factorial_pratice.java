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
        Fibonacci f = new Fibonacci(5);
        int result = f.factorial(5);
        System.out.println(result);
        Fibonacci j = new Fibonacci(10);
        for (int i = 0; i <= 10; i++) {
            System.out.print(j.fibonacci(i) + " ");
    }
}
}
