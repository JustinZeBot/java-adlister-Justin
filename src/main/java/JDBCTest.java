import com.mysql.cj.jdbc.Driver;


import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCTest {
    
    
    private static List<String> getAlbumNames(){

                try{
                    //establish connection to database
                    DriverManager.registerDriver(new Driver());
                    Connection connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                            "root",
                            "codeup");

                    //create statement

//                    Statement statement =




                } catch (SQLException sqle){
                    sqle.printStackTrace();
                }
        List<String> albumName;
//        return albumName;

    }
    
}
