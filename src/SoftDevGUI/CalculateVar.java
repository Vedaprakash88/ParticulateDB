package SoftDevGUI;

public class CalculateVar {
    // pass values here to calculate
    public static int actual;
    public static int target;
    public static int variance;
    public static boolean varType = false;

    public static int calcVar(int tar, int act) {
        actual = act;
        target = tar;

        variance = target - actual;

        return variance;
    }

    public static boolean retBool(int variance, int target) {


        if (variance > 0) {
            varType = false;
        } else {
            varType = true;
        }
        return  varType;
    }
}
