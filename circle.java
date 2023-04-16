public class circle {
    point center ;
    double radius;
    int x ;
    int y;

    public  circle(point center,double radius){
        this.center = center;
        this.radius = radius;
    }

    public circle(int x,int y,double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }

    public double CalculateArea() {
        return Math.PI * radius * radius;
    }
}
