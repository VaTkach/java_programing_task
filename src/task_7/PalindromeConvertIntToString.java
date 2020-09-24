package task_7;

import java.util.Scanner;

public class PalindromeConvertIntToString {

    public void palindromeIntToString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in field: ");
        int number;
        boolean countNumber = true;
        while (countNumber) {
            number = scanner.nextInt();
            String convertedInput = "";
            String reversedSting = "";
            convertedInput = String.valueOf(number);
            countNumber = false;

            for (int i = convertedInput.length() - 1; i >= 0; i--) {
                reversedSting = reversedSting + convertedInput.charAt(i);
            }
            int reverseInt = Integer.parseInt(reversedSting);
            if (number == reverseInt) {
                System.out.println("palindrome");
            } else {
                System.out.println("Not Palindrome");

            }
        }
    }
}
