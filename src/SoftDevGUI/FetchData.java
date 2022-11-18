package SoftDevGUI;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class FetchData {
   static ArrayList<String> staArr = new ArrayList<>();
    static ArrayList<String> staDate = new ArrayList<>();
    static ArrayList<String> staTarget = new ArrayList<>();

    static String[][] myData;

    public String[][] fetchData() {

        try {
            staArr.clear();
            staDate.clear();
            staTarget.clear();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM data");
            staArr.add("Select");

            while (resultSet.next()) {
                staArr.add(resultSet.getString("station_id"));
                staDate.add(resultSet.getString("date"));
                staTarget.add(resultSet.getString("target_value"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] stringArray = staArr.toArray(new String[0]);
        String[] dateArray = staDate.toArray(new String[0]);
        String[] TargetArray = staTarget.toArray(new String[0]);


        myData = new String[][]{stringArray, dateArray, TargetArray};

        return myData;

    }

}

