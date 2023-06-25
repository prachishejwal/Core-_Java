package Date;

import static java.time.LocalDate.now;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Testdate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//gives  you currdate with time
		Date d=new Date();
		System.out.println(d);//Sun Apr 30 21:55:20 IST 2023
		
		//gives you curdate
		//LocalDate today=LocalDate.now();
		LocalDate today=now();
		System.out.println(today);//2023-04-30
		
		//gives you current time
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		//gives you current date and time
		LocalDateTime cur=LocalDateTime.now();
		System.out.println(cur);//23-04-30T22:44:32.405718200
		

	}

}
