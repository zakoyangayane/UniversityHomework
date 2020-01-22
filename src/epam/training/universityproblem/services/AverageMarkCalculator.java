package epam.training.universityproblem.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageMarkCalculator {

    /*calculating the average mark*/
    public static double averageMark(int[] marks) {
        if (marks.length == 0) {
            return 0;
        }
        double s = 0;                                //for calculating the sum of all the marks
        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }
        double average = s / marks.length;
        BigDecimal bd = new BigDecimal(average).setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();                     //the arithmetic average
    }


    /*a method for adding all marks to one array done with a dynamic array*/
    public static int[] getAllMarks(int[] allMarks, int[] currentMarks) {
        int[] newArray = new int[allMarks.length + currentMarks.length];
        for (int i = 0; i < allMarks.length; i++) {
            newArray[i] = allMarks[i];
        }

        for (int i = 0; i < currentMarks.length; i++) {
            newArray[allMarks.length + i] = currentMarks[i];
        }
        return newArray;
    }
}
