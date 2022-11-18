package SoftDevGUI;

import java.sql.*;
import java.util.ArrayList;

public class Sandpit {

        static ArrayList<String> staArr = new ArrayList<>();
        static ArrayList<String> staDate = new ArrayList<>();
        static ArrayList<String> staTarget = new ArrayList<>();

    public static void main(String[] args) {

           try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM data");

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


            String[][] myData = {stringArray, dateArray, TargetArray};

        System.out.println(myData[0][1]);
        System.out.println(myData[1][1]);
        System.out.println(myData[2][1]);


        }
    }

//
//
//    package SoftDevGUI;
//
//            import java.sql.*;
//            import java.util.ArrayList;
//
//public class FetchData {
//    static ArrayList<String> staArr = new ArrayList<>();
//    static ArrayList<String> staDate = new ArrayList<>();
//    static ArrayList<String> staTarget = new ArrayList<>();
//
//    public ArrayList<String> fetchData() {
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icecreame", "root", "Srh123$");
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM data");
//
//            while (resultSet.next()) {
//                staArr.add(resultSet.getString("station_id"));
//                staDate.add(resultSet.getString("date"));
//                staTarget.add(resultSet.getString("target_value"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return staArr; }
//}
//





