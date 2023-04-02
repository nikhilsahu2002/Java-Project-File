class Petname {
    String name;
        public void Eat() {
            System.out.println("I can Eat");
        }
}

class Dog extends Petname{
    public void Display() {
        System.out.println("my name is " + name);
    }
}
class Element{
    public int El(int x,int y) {
        int z =x + y;
        return z;
    }
}

class Add extends Element{
    public void add() {
        System.out.println(El(5, 15));
    }
}

class inheritence {
    public static void main(String[] args) {
        // Dog Labradore = new Dog();
        // Labradore.name = "Labradore";
        // Labradore.Display();
        // Labradore.Eat();
        Add sum = new Add();
        sum.add();
    }
}
