package task_10;

import utils.FileReader;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ProgrammingDays {
    private static FileReader fileReader = new FileReader();
    private static int year = Integer.parseInt(fileReader.getPropValues("properties/properties_task10.properties", "year"));

    private DayOfWeek programmerDayCalculation() {
        LocalDate localDate = LocalDate.of(year, 01, 01);
        LocalDate programmersDayDate = localDate;
        if (year % 4 == 0) {
            if ((year % 100 == 0) || (year % 400 == 0)) {
                programmersDayDate = localDate.plusDays(256);
            } else {
                programmersDayDate = localDate.plusDays(255);
            }
        } else {
            programmersDayDate = localDate.plusDays(255);
        }
        System.out.println(programmersDayDate);
        return programmersDayDate.getDayOfWeek();
    }

    public void pintProgrammerDay() {
        System.out.println(String.format("Programmers Day in %d year will be on ", year) + programmerDayCalculation());
    }
}
