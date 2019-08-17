package sec6_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Program1 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		/*somando 4 horas a minha hora instanciada em d
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime(); */
		
		//pega os minutos da instancia d
		int minutes = cal.get(Calendar.MINUTE);
		// sempre adicionar um pois o mes comeca com zero
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		System.out.println("-----------------");
		System.out.println(sdf.format(d));

	}

}
