import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Joda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = new Locale("en", "gb");
        
        DateTime dt = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.longDate();
        String str = fmt.withLocale(locale).print(dt);
        System.out.println("Default: " + str);
        System.out.println("Buddist: " + fmt.withLocale(locale).withChronology( BuddhistChronology.getInstance()).print(dt));
        System.out.println("Islamic: " + fmt.withChronology(IslamicChronology.getInstance()).print(dt));
        System.out.println("Ethiopic: " + fmt.withChronology(EthiopicChronology.getInstance()).print(dt));
        System.out.println("Julian: " + fmt.withChronology(JulianChronology.getInstance()).print(dt));
 
        
        System.out.println("Default: " + dt.getYear());
        

	}

}
