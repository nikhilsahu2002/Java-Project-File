interface  add {
     int Add(int a,int b);
}

interface SubTract {
    int sub(int a ,int b);
}


public class Multiple_inharetance_Example implements add ,SubTract {
    @Override
        public int Add(int a,int b) {
            return a+b;
        }
        public int  sub(int a,int b) {
            return a-b;
        }
    public static void main(String[] args) {
        Multiple_inharetance_Example obj = new Multiple_inharetance_Example();
        System.out.println((obj.Add(10, 11)));
        System.out.println(obj.sub(20, 10));
    }
}
