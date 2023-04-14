class Circle implements shape{
    int x;
    int y;
    double radious;

    Circle(int x,int y,int radious){
        this.x = x;
        this.y = y;
        this.radious = radious; 

    }

    @Override
    public double area() {
        return Math.PI * radious *radious;
    }

    @Override
    public double parimeter() {
        return 2 * Math.PI *radious;
    }
}

class RecTrangle implements shape{
    int weight;
    int height;
    RecTrangle(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    @Override
    public double area() {
        return height *weight;
    }
    @Override
    public double parimeter() {
        return 2 * ( height + weight);
    }
}

class Trangle implements shape{
    int weight ;
    int height ;
    int c;
    Trangle(int weight,int height,int c){
        this.weight = weight;
        this.height = height;
        this.c = c;
    }
    @Override
    public double area() {
        return (height * weight) /2;
    }
    @Override
    public double parimeter() {
        return height + weight + c;
    }
}
interface shape{
    public double area();
    public double parimeter() ;
}

class Interface {
    public static void main(String[] args) {
        shape shape1 = new Circle(15,26,25);
        shape shape2 = new Trangle(10,15,20);
        shape shape3 = new RecTrangle(10,25);

        System.out.println(shape1.area());
        System.out.println(shape2.area());
        System.out.println(shape3.area());
        
    }
    // interface only contain method and class constant
}
