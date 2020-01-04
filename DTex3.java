package javadatetime;
import java.time.LocalTime;
public class DTex3
{
	public static void main(String args[])
	{
		LocalTime localTime= LocalTime.now(); // Current Time
		System.out.println(localTime);
		
		LocalTime localTime2= LocalTime.of(4, 30, 45); // Specify Time
		System.out.println(localTime2);
		System.out.println("Hour : "+localTime.getHour());
		System.out.println("Minute : "+localTime.getMinute());
		System.out.println("Second : "+localTime.getSecond());
		
		//LocalTime's plus methods
		System.out.println("Addition of Hours : "+localTime.plusHours(2));
		System.out.println("Addition of Minutes : "+localTime.plusMinutes(30));
		System.out.println("Addition of Seconds : "+localTime.plusSeconds(20));
		System.out.print("Addition of Nanos : "+localTime.plusNanos(6000));
		
		//LocalTime's Minus methods
		System.out.println("Subtraction of Hours : "+localTime.minusHours(2));
		System.out.println("Subtraction of Minutes : "+localTime.minusMinutes(30));
		System.out.println("Subtraction of Seconds : "+localTime.minusSeconds(20));
		System.out.print("Subtraction of Nanos : "+localTime.minusNanos(6000));
		
		LocalTime localTime3 = LocalTime.of(11, 45, 20);
		
		//compareTo() example
		if(localTime.compareTo(localTime2)==0)
		{
			System.out.println("localDate1 and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and localDate 2 are not equal");
		}
		// isBefore() example
		if(localTime2.isBefore(localTime3));
		{
			System.out.println("localTime2 comes before localTime3");
		}
		
		//isAfter() example
		if(localTime3.isAfter(localTime))
		{
			System.out.println("localTime3 comes after localTime1");
			}
		}
	}