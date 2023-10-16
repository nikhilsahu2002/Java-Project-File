class BOOK{
    int pages ;
    double cost;
    String name;
    
    BOOK(int pages,double cost , String name){
        this.pages = pages;
        this.cost = cost;
        this.name = name;
    }

    public void Deatiles() {
        System.out.println("The Name of BOOK is " + name +  ". Book Contains This "+  pages + " Number Of Pages And" +  " There Cost is " + cost);
    }
}

public class This_Constructer {
    public static void main(String[] args) {
        BOOK obj = new BOOK(128,400.23,"Stranger");
        obj.Deatiles();
    }
}
