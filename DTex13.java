package javadatetime;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
public class DTex13 
{
	public static void main(String args[])
	{
		Period p1= Period.ofDays(24);
		Temporal temp= p1.addTo(LocalDate.now());
		System.out.println(temp);
		Period p2= Period.of(2020, 01, 03);
		System.out.println(p2.toString());
		Period p3= Period.ofMonths(4);
		Period p4= p3.minus(Period.ofMonths(2));
		System.out.println(p4);
		Period p5= p3.plus(Period.ofMonths(2));
		System.out.println(p5);
		Duration d= Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
		Duration d1= Duration.between(LocalTime.MAX,LocalTime.NOON);
		System.out.println(d1.isNegative());
		Duration d2= Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(d2.isNegative());
		System.out.println(d.getSeconds());
		Duration d3= d.minus(d);
		System.out.println(d3.getSeconds());
		Duration d4= d.plus(d);
		System.out.println(d4.getSeconds());
	}
}