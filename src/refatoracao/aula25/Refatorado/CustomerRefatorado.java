package refatoracao.aula25.Refatorado;

import java.util.ArrayList;
import java.util.List;

import refatoracao.aula25.Original.Movie;

public class CustomerRefatorado {
	private String name;
	private List<RentalRefatorado> rentals = new ArrayList<RentalRefatorado>();
	
	public CustomerRefatorado(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addREntal(RentalRefatorado rental) {
		rentals.add(rental);
	}
	
	public String statement() {
		String result = "Rental record for " +getName() + "\n";
		for (RentalRefatorado rental: rentals) {
			double amount = rental.getCharge();
			
			//show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";			
		}
		
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		
		return result;		
	}
	
	private int getTotalFrequentRenterPoints() {
		int total = 0;
		for (RentalRefatorado rental: rentals) {
			total += rental.getFrequentRenterPoints();
		}
		return total;
	}

	public String htmlStatement() {
		String result = "<H1>Rental record for " +getName() + "</H1>\n";
		for (RentalRefatorado rental: rentals) {
			double amount = rental.getCharge();
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "<BR>\n";			
		}
		result += "<P>Amount owed is <EM>" + String.valueOf(getTotalCharge()) + "</EM> </P>\n";
		result += "<P>You earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) 
												+ "</EM> frequent renter points</P>";
		
		return result;		
	}

	private double getTotalCharge() {
		double total = 0;
		for (RentalRefatorado rental: rentals)
				total += rental.getCharge();
		return total;
	}
}
