package cursoprogramacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = sdf1.parse("08/07/2022");
		Date y2 = sdf2.parse("08/07/2022 04:44:00");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		

	}

}
