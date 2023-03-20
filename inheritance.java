class room{
    int length;
    int breath;

    room(int x,int y){
        length =x;
        breath =y;

    }
    int area(){
        return(length *breath);
    }
}

class bedroom extends room{
    int height;
    bedroom(int x,int y,int z){
        super(x, y);
        height =z;
    }

    int volume(){
        return(height + length + breath);
    }
    
}

class inheritance {
    public static void main(String[] args) {
        bedroom room1 = new bedroom(15, 12, 25);
        int area1=room1.area();
        int volume1 = room1.volume();

        System.out.println("Area1 =" + area1);
        System.out.println("Volume =" + volume1);

    }   
}