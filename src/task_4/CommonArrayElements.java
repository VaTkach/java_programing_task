package task_4;

import utils.FileReader;

import static utils.ArrayConverter.stringToArray;

public class CommonArrayElements {
    private static FileReader fileReader = new FileReader();
    String str1 = fileReader.getPropValues("properties/properties_task4.properties", "a");
    String str2 = fileReader.getPropValues("properties/properties_task4.properties", "b");

    public void findingCommonArrayElements() {
        int[] a = stringToArray(str1);
        int[] b = stringToArray(str2);
        int[] common = new int[a.length + b.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    common[k] = a[i];
                    k++;

                }
            }
        }
        for (int i=0;i<k;i++){
            System.out.println("Common elements: " +common[i]);
        }
        if (k==0)
            System.out.print("No common elements found");
    }
}


