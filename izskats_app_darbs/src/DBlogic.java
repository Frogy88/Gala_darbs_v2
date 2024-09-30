import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBlogic {

    private String DB = "jdbc:mysql://localhost:3306/iepirkuma_registresanas_sistema";
    private String USER = "root";
    private String PASS = "Sniegs1998";

    public void register(){
        try{

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String query = "INSERT INTO registresanas_sistema VALUES('2024-06-15',6,'ipad pro 256gb',1400.00)";
            stmt.executeUpdate(query);
            System.out.println("Dati ievietoti...");


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
