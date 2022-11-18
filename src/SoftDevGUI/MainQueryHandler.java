package SoftDevGUI;

import java.util.ArrayList;

public class MainQueryHandler {

    public static String[][] myData;
    public static boolean first;

    public static void main(String[] args) {
        CreateGUI guiWindow = new CreateGUI();
        guiWindow.setVisible(true);
        FetchData bringStations = new FetchData();
        myData = bringStations.fetchData();
        first = true;
        guiWindow.loadCombo(myData[0]);
    }

}
