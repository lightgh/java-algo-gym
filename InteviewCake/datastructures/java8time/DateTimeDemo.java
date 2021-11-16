package datastructures.java8time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        Date oldDate = new Date();
        System.out.println(oldDate);

        LocalDate date1 = LocalDate.of(2020, 05, 20);
        LocalDate date2 = LocalDate.of(2020, Month.APRIL, 20);
        System.out.println(date1);
        System.out.println(date2);

        LocalDate date3 = LocalDate.parse("12/02/2021", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date3);

        LocalDate date4 = LocalDate.parse("02/12/2021", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(date4);

        LocalDate date5 = LocalDate.parse("02/12/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date5);

        LocalDate date6 = LocalDate.parse("12/2021/02", DateTimeFormatter.ofPattern("MM/yyyy/dd"));
        System.out.println(date6);

        LocalDate date7 = LocalDate.parse("02/2021/10", DateTimeFormatter.ofPattern("dd/yyyy/MM"));
        System.out.println(date7);

        // Adding Days and Months to a given date:
        System.out.println("Adding Days and months to a given date");
        LocalDate lDate1 = LocalDate.parse("2015-02-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(lDate1);

        LocalDate lDate2 = lDate1.plusDays(4);
        System.out.println(lDate2);

        LocalDate lDate3 = lDate2.plus(4, ChronoUnit.MONTHS);
        System.out.println(lDate3);

        DayOfWeek dayOfWeek = LocalDate.parse("2017-04-06").getDayOfWeek();
        System.out.println(dayOfWeek);

        boolean isBefore = LocalDate.parse("2020-03-12")
                .isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);

        boolean isAfter = LocalDate.parse("2020-03-12")
                .isAfter(LocalDate.parse("2018-06-14"));
        System.out.println(isAfter);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.of(11, 25);
        System.out.println(time1);

        time1 = LocalTime.of(11, 25, 03);
        System.out.println(time1);

        time1 = LocalTime.of(11, 25, 04, 323);
        System.out.println(time1);

        LocalTime time3 = LocalTime.parse("08:27");
        System.out.println(time3);

        time3 = LocalTime.parse("08:27", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time3);

        System.out.println("Adding Seconds, Minutes and Hours to a given time");
        time3 = time3.plusSeconds(4);
        System.out.println(time3);

        time3 = time3.plusMinutes(10);
        System.out.println(time3);

        time3 = time3.plusHours(2);
        System.out.println(time3);

        time3 = time3.plus(4, ChronoUnit.MINUTES);
        System.out.println(time3);

        int minute = time3.getMinute();
        System.out.println(minute);

        boolean tIsBefore = LocalTime.parse("06:23")
                .isBefore(LocalTime.parse("07:50"));
        System.out.println(tIsBefore);

        boolean tIsAfter = LocalTime.parse("06:23")
                .isAfter(LocalTime.parse("07:50"));
        System.out.println(tIsAfter);


        System.out.println("LocalDateTime");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.of(2019, Month.AUGUST, 03, 23, 34);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.parse("2020-06-20T07:54:00");
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.parse("2020-05-12T08:30:00").plusDays(4);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.parse("2020-05-12T08:30:00").plus(4, ChronoUnit.MONTHS);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.parse("2020-05-12T08:30:00").minusMonths(4);
        System.out.println(localDateTime);

        System.out.println("ZonedDateTime");
        ZoneId zoneId = ZoneId.of("America/Marigot");
        System.out.println("Zone Id: " + zoneId);

        // Old TimeZones does not enforces checks while the new one enforces checks
        TimeZone oldZone = TimeZone.getTimeZone("America/Marigot");
        System.out.println("CORRECT-OLD-TIME-ZONE: \n" + oldZone);

        oldZone = TimeZone.getTimeZone("America/Marigotu");
        System.out.println("ERROR-OLD-TIME-ZONE: \n" + oldZone);

        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();

        for (String zone : zoneIdList){
            System.out.println(zone);
        }

        System.out.println("Zones Totalling: " + zoneIdList.size());

        System.out.println("Creating A ZonedDateTime Instance: ");

        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println(zoneDateTime);

        zoneId = ZoneId.of("Canada/Atlantic");

        zoneDateTime = ZonedDateTime.of(2020, 10, 15, 23, 45, 59, 1234, zoneId);

        System.out.println(zoneDateTime);

        System.out.println("Year: " + zoneDateTime.getYear());
        System.out.println("Month: " + zoneDateTime.getMonth());
        System.out.println("DayOfWeek: " + zoneDateTime.getDayOfWeek());
        System.out.println("Day Of Month: " + zoneDateTime.getDayOfMonth());
        System.out.println("Day Of Year: " + zoneDateTime.getDayOfYear());
        System.out.println("Hour: " + zoneDateTime.getHour());
        System.out.println("Minute: " + zoneDateTime.getMinute());
        System.out.println("Second: " + zoneDateTime.getSecond());
        System.out.println("Nano: " + zoneDateTime.getNano());

        System.out.println("Period");
        Period period = Period.ofDays(5);
        System.out.println(period.getDays());

        period = Period.ofMonths(3);
        System.out.println(period.getMonths());

        period = period.ofYears(2);
        System.out.println(period.getYears());


        period = Period.of(2, 5, 12);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        period = Period.between(LocalDate.parse("2020-05-18"), LocalDate.parse("2017-04-17"));
        System.out.println(period);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("The difference between two dates is: " + years
                + " years, " + months + " Months");

        Duration duration = Duration.ofDays(1);
        System.out.println(duration.getSeconds() + " seconds");

        duration = Duration.ofHours(2);
        System.out.println(duration.getSeconds() + " seconds");

        duration = Duration.ofMinutes(23);
        System.out.println(duration.getSeconds() + " seconds");

        duration = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration.getSeconds() + " seconds");


        duration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));
        System.out.println("The difference is: " + duration);
        System.out.println("The difference is: " + duration.getSeconds() + " Seconds");
    }
}
