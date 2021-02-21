package FinalProject;

import java.time.LocalDate;
import java.util.HashMap;
public class Ticket {
	
	private int counter;
	private String pnr;
	private LocalDate date;
	private Train train;
	private HashMap<Passenger, Double>passengers;
	
	public Ticket(LocalDate date,Train train)
	{
		super();
		this.date = date;
		this.train = train;
	}
	public String generatePNR() {
		 StringBuilder stringBuilder = new StringBuilder();
		 StringBuilder Append(train.source.charAt(0));
		 StringBuilder.Append(train.destination.charAt(0));
		 StringBuilder.Append("_");
		 StringBuilder.Append(travelDate).reverse();
		 StringBuilder.Append("_");
		 StringBuilder.Append(counter);
		 pnr=stringBuilder.toString();
		 
		 return pnr;
	
		 
		 
	}
