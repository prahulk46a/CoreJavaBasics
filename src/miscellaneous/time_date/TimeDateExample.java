package miscellaneous.time_date;

import java.time.LocalDate;

public class TimeDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.ofEpochDay(20654);
        System.out.println("Current date: " + localDate);
        System.out.println("Local date of epoch day: " +localDate2 );
    }

}
