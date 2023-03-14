public class student {
    private String name;
    private int age;
    private String Colour;
    private String sex;
    private static int id =0;

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
    public student(String name, int age ,String Colour,String m) {
        this.name= name;
        this.Colour= Colour;
        this.age =age;
        this.sex=m;
        id++;
    }

    public student() {
        id++;
    }

    // getter and setter 
    // here will go all get function
    public String getName(){
        return name;
    }

    public String getColour(){
        return Colour;
    }

    public String getsex(){
        return sex;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    //here will go Setter 

    public void setName(String newName){
        this.name = newName;
    }

    public void setColour(String newColour){
        this.Colour = newColour;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setId(int newid){
        id =newid;
    }

}
