
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_db {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("dbURL","root","1234");
            Statement state = con.createStatement();
            System.out.println("connected");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
