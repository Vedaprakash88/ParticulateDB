package SoftDevGUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DelStation {


    public void deleteStat (String statID) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
            Statement statement = conn.createStatement();
            statement.execute("DELETE FROM data WHERE station_id = '" + statID + "'");
            statement.close();
            JOptionPane.showMessageDialog(null, "Station " + statID + " Successfully Removed from the Database", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
