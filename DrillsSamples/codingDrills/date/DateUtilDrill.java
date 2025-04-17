package codingDrills.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;


public class DateUtilDrill {
    public static void main(String[] args) {
        LocalDate lastMonthStart = LocalDate.now().minusMonths(1).withDayOfMonth(1);
        LocalDate lastMonthEnd = lastMonthStart.plusMonths(1).minusDays(1);

        LocalDate currentMonthStart = LocalDate.now().withDayOfMonth(1);
        LocalDate currentMonthEnd = currentMonthStart.plusMonths(1).minusDays(1);

        System.out.println("Last Month Start : " + lastMonthStart);
        System.out.println("Last Month End : " + lastMonthEnd);

        System.out.println("Current Month Start : " + currentMonthStart);
        System.out.println("Current Month End : " + currentMonthEnd);
        System.out.println("------------------------------------------------------");
        System.out.println("Instant Last Month Start : " + lastMonthStart.atStartOfDay(ZoneOffset.UTC).toInstant()   );
        System.out.println("Instant Last Month End : " + lastMonthEnd.atStartOfDay(ZoneOffset.UTC).toInstant());

        System.out.println("Instant Current Month Start : " + currentMonthStart.atStartOfDay(ZoneOffset.UTC).toInstant());
        System.out.println("Instant Current Month End : " + currentMonthEnd.atStartOfDay(ZoneOffset.UTC).toInstant());

        System.out.println("------------------------------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSS");

        System.out.println("Formatted Localdate Last Month Start : " + lastMonthStart.atStartOfDay().format(formatter)   );
        System.out.println("Formatted Localdate Last Month End : " + lastMonthEnd.atTime(LocalTime.MAX).format(formatter));

        System.out.println("Formatted Localdate Current Month Start : " + currentMonthStart.atStartOfDay().format(formatter));
        System.out.println("Formatted Localdate Current Month End : " + currentMonthEnd.atTime(LocalTime.MAX).format(formatter));


        ZoneId zoneId = ZoneId.of("UTC"); // Change as needed

        // This week (Monday to today)
        LocalDate startOfThisWeek = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        LocalDateTime startOfThisWeekDateTime = startOfThisWeek.atStartOfDay();
        LocalDateTime endOfThisWeekDateTime = LocalDateTime.now();

        // Last week (Previous Monday to Previous Sunday)
        LocalDate startOfLastWeek = startOfThisWeek.minusWeeks(1);
        LocalDate endOfLastWeek = startOfThisWeek.minusDays(1);
        LocalDateTime startOfLastWeekDateTime = startOfLastWeek.atStartOfDay();
        LocalDateTime endOfLastWeekDateTime = endOfLastWeek.atTime(23, 59, 59, 999_999_999);

        // This month (1st to today)
        LocalDate startOfThisMonth = LocalDate.now().withDayOfMonth(1);
        LocalDateTime startOfThisMonthDateTime = startOfThisMonth.atStartOfDay();
        LocalDateTime endOfThisMonthDateTime = LocalDateTime.now();

        // Last month (1st to last day of last month)
        LocalDate startOfLastMonth = startOfThisMonth.minusMonths(1);
        LocalDate endOfLastMonth = startOfThisMonth.minusDays(1);
        LocalDateTime startOfLastMonthDateTime = startOfLastMonth.atStartOfDay();
        LocalDateTime endOfLastMonthDateTime = endOfLastMonth.atTime(23, 59, 59, 999_999_999);

        // Last 6 months (From 1st of the month 6 months ago to today)
        LocalDate startOfLast6Months = startOfThisMonth.minusMonths(6);
        LocalDateTime startOfLast6MonthsDateTime = startOfLast6Months.atStartOfDay();
        LocalDateTime endOfLast6MonthsDateTime = LocalDateTime.now();

        // Last 12 months (From 1st of the month 12 months ago to today)
        LocalDate startOfLast12Months = startOfThisMonth.minusMonths(12);
        LocalDateTime startOfLast12MonthsDateTime = startOfLast12Months.atStartOfDay();
        LocalDateTime endOfLast12MonthsDateTime = LocalDateTime.now();

        // Print Results
        System.out.println("This Week: " + startOfThisWeekDateTime + " to " + endOfThisWeekDateTime);
        System.out.println("Last Week: " + startOfLastWeekDateTime + " to " + endOfLastWeekDateTime);
        System.out.println("This Month: " + startOfThisMonthDateTime + " to " + endOfThisMonthDateTime);
        System.out.println("Last Month: " + startOfLastMonthDateTime + " to " + endOfLastMonthDateTime);
        System.out.println("Last 6 Months: " + startOfLast6MonthsDateTime + " to " + endOfLast6MonthsDateTime);
        System.out.println("Last 12 Months: " + startOfLast12MonthsDateTime + " to " + endOfLast12MonthsDateTime);

        System.out.println("--------------------------------------------");

        for (TimeRange range : TimeRange.values()) {
            System.out.println(range + " -> " + range.getDateRange());
        }
        System.out.println("--------------------------------------------");
        TimeRange range2 = TimeRange.LAST_6_MONTHS;
        System.out.println(range2 + " | "+ range2.getDateRange());
    }


    public enum TimeRange {
        THIS_WEEK,
        LAST_WEEK,
        THIS_MONTH,
        LAST_MONTH,
        LAST_6_MONTHS,
        LAST_12_MONTHS;

        /**
         * Get the start and end date for the given time range.
         * @return A DateRange object containing start and end dates.
         */
        public DateRange getDateRange() {
            LocalDate today = LocalDate.now();

            switch (this) {
                case THIS_WEEK:
                    LocalDate weekStart = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
                    return new DateRange(weekStart, today);

                case LAST_WEEK:
                    LocalDate lastWeekStart = today.minusWeeks(1).with(java.time.DayOfWeek.MONDAY);
                    LocalDate lastWeekEnd = lastWeekStart.plusDays(6);
                    return new DateRange(lastWeekStart, lastWeekEnd);

                case THIS_MONTH:
                    LocalDate monthStart = today.with(TemporalAdjusters.firstDayOfMonth());
                    return new DateRange(monthStart, today);

                case LAST_MONTH:
                    LocalDate lastMonthStart = today.minusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
                    LocalDate lastMonthEnd = lastMonthStart.with(TemporalAdjusters.lastDayOfMonth());
                    return new DateRange(lastMonthStart, lastMonthEnd);

                case LAST_6_MONTHS:
                    LocalDate sixMonthsAgo = today.minusMonths(6).with(TemporalAdjusters.firstDayOfMonth());
                    return new DateRange(sixMonthsAgo, today);

                case LAST_12_MONTHS:
                    LocalDate twelveMonthsAgo = today.minusMonths(12).with(TemporalAdjusters.firstDayOfMonth());
                    return new DateRange(twelveMonthsAgo, today);

                default:
                    throw new IllegalArgumentException("Unknown time range");
            }
        }

        /**
         * Helper class to store start and end dates.
         */
        public static class DateRange {
            private final LocalDate startDate;
            private final LocalDate endDate;

            public DateRange(LocalDate startDate, LocalDate endDate) {
                this.startDate = startDate;
                this.endDate = endDate;
            }

            public LocalDate getStartDate() {
                return startDate;
            }

            public LocalDate getEndDate() {
                return endDate;
            }

            @Override
            public String toString() {
                return "DateRange{start=" + startDate + ", end=" + endDate + '}';
            }
        }
    }
}
