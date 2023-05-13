abstract class shape{
    abstract double area();
}

class Circale extends shape {
    double radious;
    Circale (double radious){
        this.radious = radious;
    }
    @Override
    double area() {
        return Math.PI * radious *radious;
    }
}

class Rectrangle extends shape {
    double height;
    double weight;
    Rectrangle(double height , double weight){
        this.height = height;
        this.weight = weight;
    }
    @Override
    double area(){
        return weight* height;
    }
}

public class  AbstractionExample   {
    public static void main(String[] args) {
        shape[] s = { new Circale(2.5),new Rectrangle(10,20)}; 
        for (shape shape : s) {
            System.out.println(shape.area());
        }
    }
}
