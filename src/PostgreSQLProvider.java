import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PostgreSQLProvider implements IContactsProvider{

    Connection con = null;
//    public PostgreSQLContactsProvider(){
//        try {
//            String url = "jdbc:postgresql://89.36.214.106:5432/geo";
//            String usuari = "geo";
//            String password = "geo";
//            con = DriverManager.getConnection(url,usuari,password);
//            String sql  ;
//
//            Statement st1 =con.createStatement();
//            st1.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public List<Contact> loadContacts() {

        return null;
    }

    @Override
    public void add(Contact contact) {

    }

    @Override
    public void remove(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }
}
