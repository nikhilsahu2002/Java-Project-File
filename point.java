@interface overloading {

}


public class point {
    int x;
    int y;

    public  point(int x,int y){
        this.x =x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    @overloading
    public String toSting(){
        return "point{"+
                "x"+ x +
                ",y=" + y +
                '}';
    }
}
