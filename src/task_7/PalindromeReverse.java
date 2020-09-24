package task_7;

import java.util.Scanner;

public class PalindromeReverse {
    public void checkPalindromeReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the something text ");
        String str = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        String str2 = stringBuffer.reverse().toString();
        System.out.println("Entering string = " + str + " Reverse string = " + str2);
        if (str.equals(str2)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
