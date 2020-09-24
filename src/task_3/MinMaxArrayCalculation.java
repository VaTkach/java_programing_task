package task_3;

import utils.FileReader;

import java.util.Arrays;

import static utils.ArrayConverter.stringToArray;

public class MinMaxArrayCalculation {
    private static FileReader fileReader = new FileReader();
    private static String str = fileReader.getPropValues("properties/properties_task3.properties", "ARRAY");
    private int[] minMaxArrayCalculation() {

        int[] myIntArray = stringToArray(str);

        int min = myIntArray[0];
        int max = myIntArray[0];
        for (int i = 0; i < myIntArray.length; i++) {
            if (min > myIntArray[i]) {
                min = myIntArray[i];
            }
            if (max < myIntArray[i]) {
                max = myIntArray[i];
            }
        }
        return new int[] {min,max};
    }
    public void minMaxResult(){
        System.out.println(Arrays.toString(minMaxArrayCalculation()));
    }


}
