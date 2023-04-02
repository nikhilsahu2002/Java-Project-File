class num{
    int x ;
    int y ;
    
    num(int a,int b){
        x=a;
        y=b;
    }
    int sum(){
        return x+y;
    }
    int MUL(){
        return x*y;
    }
    int div(){
        return x/y;
    }
}


class add_MUl_div {
    public static void main(String[] args) {
        num a = new num(5, 7);
        int num1 =a.sum();
        System.out.println(num1);
    }
}
