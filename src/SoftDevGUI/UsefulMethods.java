package SoftDevGUI;

import java.util.ArrayList;
import java.util.Objects;


public class UsefulMethods {

    static ArrayList<String> finalArr = new ArrayList<>();

    public String[] findIndex (String selectedValue) {

        FetchData bringStations = new FetchData();
        String[][] newMyData = bringStations.fetchData();

        String[] nStaList = newMyData[0];
        String[] nDateList = newMyData[1];
        String[] nTargetList = newMyData[2];

        int index = -1;

        for (int i = 0; (i < nStaList.length) && (index == -1); i++) {
            if (Objects.equals(nStaList[i], selectedValue)) {
                index = i-1;
            }
        }

        String dateVal = nDateList[index];
        String targVal = nTargetList[index];

        finalArr.clear();
        finalArr.add(dateVal);
        finalArr.add(targVal);

        String[] datTarArr = finalArr.toArray(new String[0]);

        return datTarArr;
    }
}
