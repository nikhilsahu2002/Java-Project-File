class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("The " + name + " says...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        super.speak();
        System.out.println("Woof woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void speak() {
        super.speak();
        System.out.println("Meow!");
    }
}

public class multi {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        a.speak();

        Dog d = new Dog("Fido");
        d.speak();

        Cat c = new Cat("Whiskers");
        c.speak();
    }
}
