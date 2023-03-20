class Super {
    int x;
    Super(int x){
        this.x =x;
    }
    void display(){
        System.out.println(" ");
    }
}

class Sub extends Super{
    int y;
    Sub(int x,int y){
        
        super(x);
        this.y =y;
    }
    void display()
    {
        System.out.println("super = " + x);
        System.out.println("sub j = " + y);
    }


}

public class subclass_constructor {
    // a sub class constructor is used to counstruct the  instance varables of both the sub classs and the super class the sub class class constructer users the key word super() to invoke th counstructer Method of the super class.
    //super have folling condion 
    //1) super may ionly be used with in a sub class constructer method 
    //2) the call to super class constructer must apper as the first statment within the subclass constructer 
    //3) the parmeter in the super call must match the order and type of the instance variable declare in the super class 
    public static void main(String[] agrs) {
        Sub s1 = new Sub(8, 9);
        s1.display();
    }
    
}
