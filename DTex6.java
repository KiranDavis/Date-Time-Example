package javadatetime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class DTex6 
{
	public static void main(String args[])
	{
		OffsetTime offset= OffsetTime.now();
		int h= offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		int m= offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s= offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
		int h1= offset.getHour();
		System.out.println(h1+ " hour");
		int m1= offset.getMinute();
		System.out.println(m1+ " Minute");
		int s1= offset.getSecond();
		System.out.println(s1+ " Second");
		}

}
