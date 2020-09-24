package task_3;

import utils.FileReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static utils.ArrayConverter.intArrayToIntegerList;
import static utils.ArrayConverter.stringToArray;

public class MinMaxArrayCalculationBuiltFunction {
    private static FileReader fileReader = new FileReader();
    private static String str = fileReader.getPropValues("properties/properties_task3.properties","ARRAY_FOR_BUILT_FUNCTION");

    private int[] minMaxCalculationBuiltFunction(){
        int[] aInt = stringToArray(str);
        List<Integer> myArray = intArrayToIntegerList(aInt);
        Integer min = Collections.min(myArray);
        Integer max = Collections.max(myArray);

        return new int[]{min,max};
    }
    public void minMaxResultBuiltFunction(){
        System.out.println(Arrays.toString(minMaxCalculationBuiltFunction()));
    }
}



