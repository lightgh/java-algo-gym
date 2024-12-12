package codekatas.basicoperators;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TimeDrill {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println("i1 = " + i1);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(i1, ZoneId.of("America/Denver"));
        System.out.println("zdt = " + zdt);

        ZonedDateTime zdt1 = ZonedDateTime.ofInstant(i1, ZoneId.of("Africa/Lagos"));
        System.out.println("zdt1 = " + zdt1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        Duration dur = Duration.ofMinutes(360);
        System.out.println("dur = " + dur);

        Period per = Period.of(1, 14, 540);
        System.out.println("per = " + per);
        System.out.println("per-Normalized = " + per.normalized());

        LocalDate ld = LocalDate.of(2065, 4, 13);
        System.out.println("ld = " + ld);

        System.out.println("ld.getMonth() = " + ld.getMonth());
        LocalDate ld2 = ld.plusDays(10);

        System.out.println("ld2 = " + ld2);

        System.out.println("ld.with(ChronoField.MONTH_OF_YEAR, 7) = " + ld.with(ChronoField.MONTH_OF_YEAR, 7));

        var ld3 = LocalDate.parse("2000-07-14");
        System.out.println(ld3);

        LocalDateTime ldt2 = LocalDateTime.now();
        LocalDate ld4 = LocalDate.from(ldt2);
        System.out.println(ldt2);
        System.out.println(ld4);

        LocalDate ld1 = LocalDate.now();
        System.out.println("ld1 = " + ld1);
//        System.out.println(LocalTime.from(ld1));
        System.out.println(ld1.getYear());
        System.out.println(ld.get(ChronoField.YEAR));
//        System.out.println(ld.get(ChronoField.HOUR_OF_DAY));
        System.out.println(ld.isSupported(ChronoField.YEAR));
        System.out.println(ld.isSupported(ChronoField.MINUTE_OF_HOUR));

        var ldt3 = ld.atTime(13, 05);
        System.out.println(ldt3);
        System.out.println(ldt3.getClass().getName());

        Period oneYear = Period.ofYears(1);
        Period oneMonth = Period.ofMonths(1);
        ZonedDateTime febOne2020 = ZonedDateTime.of(2020, 2, 1, 12, 15, 30, 0, ZoneId.of("GMT"));

        System.out.println("febOne2020 = " + febOne2020);
        ZonedDateTime febOne2021 = febOne2020.plus(oneYear);
        ZonedDateTime marOne2020 = febOne2020.plus(oneMonth);
        ZonedDateTime marOne2021 = febOne2021.plus(oneMonth);
        System.out.println("marOne2021 = " + marOne2021);
        System.out.println("marOne2020 = " + marOne2020);

        Instant febOne2020Inst = febOne2020.toInstant();
        Instant febOne2021Inst = febOne2021.toInstant();
        System.out.println("febOne2020Inst = " + febOne2020Inst);
        System.out.println("febOne2021Inst = " + febOne2021Inst);

        System.out.println("febOne2020Inst.untilmarOne2020 = " + febOne2020Inst.until(marOne2020, ChronoUnit.DAYS));


    }
}
