package javadatetime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
public class DTex10 
{
	public static void main(String args[])
	{
		ZoneId zone1= ZoneId.of("Asia/Kolkata");// Indian Time
		ZoneId zone2= ZoneId.of("Asia/Tokyo");// Tokyo Time
		LocalTime id1= LocalTime.now(zone1);
		LocalTime id2= LocalTime.now(zone2);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2));
		ZoneId zone= ZoneId.systemDefault();
		System.out.println(zone);
		String s= zone.getId();
		System.out.println(s);
		System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
	}
}