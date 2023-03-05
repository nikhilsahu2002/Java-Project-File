public class student {
    String name;
    int age;
    String Colour;
    char sex;

    public void  getSex() {
        System.out.println("M");
    }
    public void Eating(){
        System.out.println("Eating");
    }
    public void Running(){
        System.out.println("Running");
    }

    // constructer 
    public student(String name, int age ,String Colour,char sex) {
        this.name= name;
        this.Colour= Colour;
        this.age =age;
        this.sex=sex;
    }

    public student() {
    }
}
