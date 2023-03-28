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

class inheritence {
    public static void main(String[] args) {
        Dog Labradore = new Dog();
        Labradore.name = "Labradore";
        Labradore.Display();
        Labradore.Eat();
    }
}
