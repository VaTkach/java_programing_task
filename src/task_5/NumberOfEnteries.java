package task_5;

import utils.FileReader;

import java.util.regex.Pattern;

public class NumberOfEnteries {
    private static FileReader fileReader = new FileReader();
    private static String a = fileReader.getPropValues("properties/properties_task5.properties", "A");
    private static String search_term = fileReader
            .getPropValues("properties/properties_task5.properties", "SEARCH_TERM");

    private int calculateNumberOfEntering() {
        int number_of_entries = 0;
        String[] parts = a.split(Pattern.quote(" "));
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals(search_term)) {
                ++number_of_entries;
            }
        }
        return number_of_entries;
    }
    public void resultNumberOfEntering(){
        System.out.println("Counter entering word = "+ calculateNumberOfEntering());
    }
}

