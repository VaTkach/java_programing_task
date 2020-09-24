package task_4;

import utils.FileReader;

import java.util.List;

import static utils.ArrayConverter.intArrayToIntegerList;
import static utils.ArrayConverter.stringToArray;

public class CommonArrayElementsBuiltFunction {
    private static FileReader fileReader = new FileReader();

    private List<Integer> finderCommonArrayElements() {
        String str1 = fileReader.getPropValues("properties/properties_task4.properties", "a");
        String str2 = fileReader.getPropValues("properties/properties_task4.properties", "b");
        int[] aInt = stringToArray(str1);
        int[] bInt = stringToArray(str2);
        List<Integer> list1 = intArrayToIntegerList(aInt);
        List<Integer> list2 = intArrayToIntegerList(bInt);
        list1.retainAll(list2);
        return list1;
    }
    public  void commonArrayElementsResult(){
        System.out.println("Common elements: built function" + finderCommonArrayElements());
    }
}

