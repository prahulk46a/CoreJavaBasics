package miscellaneous.time_date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: "+ date);

        System.out.println(preety());
        // Parse String into LocalDate -> gives exception if incorrect format
        date = date.parse("2026-07-10");
        System.out.println("Current Date: "+ date);

        System.out.println(preety());

        // Get methods
        System.out.println("Get year:"+ date.getYear()+", Get Month:"+date.getMonth()+", Get Day of Month:"+date.getDayOfMonth()+ ", Get Day of Week:"+ date.getDayOfWeek());

        System.out.println(preety());

        // Date Plus and minus methods
        date = date.plusDays(1);
        System.out.println("Date after no of days: "+date);

        date = date.plusMonths(1);
        System.out.println("Date after no of Months: "+date);

        date = date.plusYears(1);
        System.out.println("Date after no of Years: "+date);

        date = date.minusDays(1);
        System.out.println("Date before no of Months: "+date);

        date = date.minusMonths(1);
        System.out.println("Date before no of Months: "+date);

        date = date.minusYears(1);
        System.out.println("Date before no of Years: "+date);

        System.out.println(preety());

    }


    public static String preety(){
        return "================================================================================================================";
    }
}
