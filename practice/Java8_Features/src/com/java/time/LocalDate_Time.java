package com.java.time;
import java.time.*;


public class LocalDate_Time {
public static void main(String[] args) {
LocalDateTime localDateTime=	LocalDateTime.now();
System.out.println(localDateTime.getDayOfYear());
;
LocalDateTime localDateTime2=LocalDateTime.of(5000, 2, 28, 20, 10);
System.out.println(localDateTime2.plusMonths(10));

}
}
