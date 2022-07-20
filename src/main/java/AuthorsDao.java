import javax.servlet.jsp.jstl.core.Config;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.List;


public class AuthorsDao implements Authors {
    pirvate Connection connection;


    public AuthorsDao(){
        try{
            DriverManager.registerDriver(new Driver());
            Config config new Config();
    }
    @Override
    public List<Author> all() {
        return null;
    }

    @Override
    public void insert(Author author) {

    }
}
