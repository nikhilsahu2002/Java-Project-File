class area{
    int br,len;

    public void Area() {
        System.out.println("NO Parameter");
    }

    public void Area(int b ) {
        System.out.println("Area Of One Parameter :" + b*b); 
    }

    public void Area(int br,int len ) {
        System.out.println("Area Of Two Parameter :" + br*len); 
    }
}

public class Method_Overiding {
    public static void main(String[] args) {
        area obj = new area();
        obj.Area();
        obj.Area(5);
        obj.Area(5,7);
    }
    
}
