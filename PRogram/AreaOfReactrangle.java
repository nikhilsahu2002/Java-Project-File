class Reactrangle{
    int br ,len;
    Reactrangle(int b,int l){
        br = b;
        len = l;
    }
    public int Area() {
        return br*len;
    }
}

public class AreaOfReactrangle {
    public static void main(String[] args) {
        Reactrangle obj= new Reactrangle(10,20);
        System.out.println("Area Of A Rectangle Is " + obj.Area());
         
    }
}
