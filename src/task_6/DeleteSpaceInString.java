package task_6;

import utils.FileReader;

public class DeleteSpaceInString {

    private static FileReader fileReader = new FileReader();
    private static String STR = fileReader.getPropValues("properties/properties_task6.properties", "STR");

    private String deletingSpaceInSting() {
        String strResult = "";
        char space = ' ';
        for (int i = 0; i < STR.length(); i++) {
            char currentChar = STR.charAt(i);
            if (currentChar != space) {
                strResult += currentChar;
            }
        }
        return strResult;
    }

    public void resultAfterDeletingSpace() {
        System.out.println(deletingSpaceInSting());
    }

}
