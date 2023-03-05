// import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Acces_modifyer {
    public static void main(String[] args){
        // it work with not protected filed varibles
        //Example student student1 = new student();
        //student1.sex; or student1.age; can be accessed here 
        /* but if varibe is associed with prive or protect modifier it can not be accessed her or anyware*/
        
        // encapsulation
        // getter and setter
        
        student student1 =new student("nikhl",21,"Brown","m");
        student student2 =new student("Rahul",24,"Brown","m");
        // student1.setName("NIkhil");
        System.out.println("Name Of Stundent 1 :" + student1.getAge());
        System.out.println("Name Of Stundent 2 :" + student2.getAge());
    }
}
