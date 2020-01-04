package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DTex 
{
	public static void main(String args[])
	{
		LocalDate localDate = LocalDate.now(); //Current Date
		System.out.println("Today's Date is : "+localDate);// Specific Date
		LocalDate localDate2 = LocalDate.of(2020, Month.JANUARY, 02);
		System.out.println(localDate2);
		LocalDate localDate3 = LocalDate.of(1996, Month.OCTOBER, 04);
		System.out.println(localDate3);
		
		System.out.println("Year : "+localDate.getYear());
		System.out.println("Month : "+localDate.getMonth().getValue());
		System.out.println("Day of Month : "+localDate.getDayOfMonth());
		System.out.println("Day of Week : "+localDate.getDayOfWeek());
		System.out.println("Day of Year : "+localDate.getDayOfYear());
		
		//LocalDate's plus methods
		System.out.println("Addition of days : "+localDate.plusDays(5));
		System.out.println("Addition of Months : "+localDate.plusMonths(15));
		System.out.println("Addition of Weeks : "+localDate.plusWeeks(45));
		System.out.println("Addition of Years :"+localDate.plusYears(5));
		
		//LocalDate's minus methods
		System.out.println("Subtraction of days : "+localDate.minusDays(5));
		System.out.println("Subtraction of months : "+localDate.minusMonths(15));
		System.out.println("Subtraction of weeks : "+localDate.minusWeeks(45));
		System.out.println("Subtraction of years : "+localDate.minusYears(5));
		
		//isEqual() example
		if(localDate.isEqual(localDate2))
		{
			System.out.println("localDate1 and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equal");
		}
		// ifAfter() example
		if(localDate2.isAfter(localDate3));
		{
			System.out.println("localDate2 comes after localDate3");
		}
		// isBefore() example
		if(localDate3.isBefore(localDate));
		{
			System.out.println("locaDate3 comes before localDate1");
		}
	}
}