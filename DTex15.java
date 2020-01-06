package javadatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class DTex15 
{
	public static void main(String args[])
	{
		Month m= Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all Sunday are:%n", m);
		LocalDate l1= Year.now().atMonth(m).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month m1= l1.getMonth();
		while(m1 == m)
		{
			System.out.printf("%s%n", l1);
			l1= l1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			m1= l1.getMonth();
		}
		Month mo1= Month.from(LocalDate.now());
		System.out.println(mo1.getValue());
		System.out.println(mo1.name());
		System.out.println(mo1.minus(2));
		System.out.println(mo1.plus(2));
		System.out.println("Total Number of Days: "+mo1.length(true));
		}
}