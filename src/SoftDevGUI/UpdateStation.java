package SoftDevGUI;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStation {

    public void updateStat (String statID, String updDate, int updTarget) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
            Statement statement = conn.createStatement();
            statement.execute("UPDATE data SET date = '" + updDate + "' , target_value = " + updTarget + " WHERE station_id = '" + statID + "'");
            statement.close();
            JOptionPane.showMessageDialog(null, "Station " + statID + " Successfully has been updated in the Database", "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
