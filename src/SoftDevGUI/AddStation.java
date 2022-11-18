package SoftDevGUI;

import javax.swing.JOptionPane;
import java.sql.*;

public class AddStation {
    public int addStation(String addStat, String addDate, int addTarget, int addAct){

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO data VALUES ('" + addStat + "', '" + addDate + "', " + addTarget + ", " + addAct + ")");
            statement.close();
            JOptionPane.showMessageDialog(null, "Station Successfully Added to the Database", "Title", JOptionPane.INFORMATION_MESSAGE);
            return 1;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
