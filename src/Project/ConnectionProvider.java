/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;

        /**
 *
 * @author krishna
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "krishna.r.k28091");            
            System.out.println("connect");
            return con;
        }
        catch(Exception e)
        {
           System.out.println("nahi hora connect");
           return null;
        }
    }
    public static void main(String[] args) throws ClassNotFoundException 
    {    
//             Class.forName("oracle.jdbc.driver.­OracleDriver");
             Class.forName("oracle.jdbc.driver.OracleDriver");

              try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/xe", "system", "krishna.r.k28091")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
