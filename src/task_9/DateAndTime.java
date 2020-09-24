package task_9;

import utils.FileReader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    private static FileReader fileReader = new FileReader();
    private static String firstDateString = fileReader
            .getPropValues("properties/properties_task9.properties", "date1");
    private static String secondDateDateString = fileReader
            .getPropValues("properties/properties_task9.properties", "date2");
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
    private Date date1 = dateFormat.parse(firstDateString);
    private Date date2 = dateFormat.parse(secondDateDateString);

    public DateAndTime() throws ParseException {
    }


    private long millisecondsBetweenTwoDates() throws ParseException {

        long milliseconds = date2.getTime() - date1.getTime();
        return milliseconds;
    }

    private int secondsBetweenTwoDates() throws ParseException {
        int seconds = (int) (millisecondsBetweenTwoDates() / (1000));
        return seconds;
    }

    private int minutesBetweenTwoDates() throws ParseException {
        int minutes = (int) (millisecondsBetweenTwoDates() / (60 * 1000));
        return minutes;
    }

    private int hoursBetweenTwoDates() throws ParseException {
        int hours = (int) (millisecondsBetweenTwoDates() / (60 * 60 * 1000));
        return hours;
    }

    private int daysBetweenTwoDates() throws ParseException {
        int days = (int) (millisecondsBetweenTwoDates() / (24 * 60 * 60 * 1000));

        return days;
    }


    public void printDifferenceBetweenDates() throws ParseException {
        System.out.println("Difference between dates in milliseconds: " + millisecondsBetweenTwoDates());
        System.out.println("Difference between dates in seconds: " + secondsBetweenTwoDates());
        System.out.println("Difference between dates in minutes:  " + minutesBetweenTwoDates());
        System.out.println("Difference between dates in hours: " + hoursBetweenTwoDates());
        System.out.println("Difference between dates in days: " + daysBetweenTwoDates());
        System.out.println("The first date: " + date1);
        System.out.println("The second date: " + date2);

    }
}


