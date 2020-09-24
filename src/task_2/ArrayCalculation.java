package task_2;

import utils.FileReader;

import java.util.Arrays;
import java.util.stream.IntStream;

import static utils.ArrayConverter.stringToArray;

public class ArrayCalculation {
    private static utils.FileReader fileReader = new FileReader();

    private int manualArrayCalculation() {
        String aString = fileReader.getPropValues("properties/properties_task2.properties", "MANUALLY_ARRAY");
        int[] myArray = stringToArray(aString);
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum += myArray[i];
        }
        return arraySum;
    }

    public void manualArrayCalculationResult() {
        System.out.println("(Manually method) Sum of array elements = " + manualArrayCalculation());
    }

    private int builtFunctionArrayCalculation() {
        String aString = fileReader.getPropValues("properties/properties_task2.properties", "BUILT_FUNCTION_ARRAY");
        int[] myArray = stringToArray(aString);
        IntStream myArrayStream = Arrays.stream(myArray);
        int sum = myArrayStream.sum();
        return sum;
    }

    public void builtFunctionArrayCalculationResult() {
        System.out.println("(Built Function) Sum of array elements = " + builtFunctionArrayCalculation());
    }

}
