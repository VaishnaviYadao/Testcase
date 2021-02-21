package FinalProject;
import java.time.LocalDate;
import java.util.Scanner;
public class TicketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the Train Number");
         int trainNo = scan.nextInt();
         
         System.out.println("Enter travel Date");
         int date = scan.nextInt();
         int month=scan.nextInt();
         int year=scan.nextInt();
         LocalDate travelDate=LocalDate.of(date, month, year);
         
         //System.out.println(travelDate);
         
         System.out.println("Enter the Number of Passengers");
         int numberOfPassengers=scan.nextInt();
         
         System.out.println("Enter your Name:");
         String name=scan.next();
         
	}

}
