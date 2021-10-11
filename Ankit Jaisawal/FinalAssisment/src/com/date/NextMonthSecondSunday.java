package com.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.*;

public class NextMonthSecondSunday {

	public static void main(String args[]) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("First day of next month: " + now.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("First Friday in month: " + now.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)));

		// Custom temporal adjusters.
		TemporalAdjuster secondSundayOfNextMonth = temporal -> {
		    LocalDate date = LocalDate.from(temporal).plusMonths(1);
		    date = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		    return temporal.with(date);
		};
		System.out.println("Second sunday of next month: " + now.with(secondSundayOfNextMonth));
		
	}
}
