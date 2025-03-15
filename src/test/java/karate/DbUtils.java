package karate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {
    String strDbConnection = "";

    public DbUtils(String strConn) {
        strDbConnection = strConn;
    }
    
    public String readJson(String strSQL) {
        String strReturn = "";
        try (Connection con = DriverManager.getConnection(strDbConnection); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery(strSQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                strReturn += rs.getString(1);
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        return strReturn.trim();
    }

}
