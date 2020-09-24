package task_8;

import utils.FileReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidations {
    private static FileReader fileReader = new FileReader();

    private static String input = fileReader.getPropValues("properties/properties_task8.properties", "PASSWORD_NOT_SECURE");

    private boolean regexPassword() {
        Pattern template = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_*).{8,})");
        Matcher inputPassword = template.matcher(input);
        boolean isPassword = inputPassword.matches();
        return isPassword;
    }

    public void passwordResult() {
        if (regexPassword() == true) {
            System.out.println(" Secure Password");
        } else {
            System.out.println(" Not Secure Password ");
        }
    }
}


