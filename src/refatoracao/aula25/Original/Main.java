package refatoracao.aula25.Original;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Ana");
		
		Movie movie1 = new Movie("X-Men", Movie.NEW_RELEASE);
		Movie movie2 = new Movie("Esqueceram de mim", Movie.CHILDREN);
		
		Rental rental1 = new Rental(movie1, 3);
		Rental rental2 = new Rental(movie2, 3);
		
		customer.addRental(rental1);
		customer.addRental(rental2);
		System.out.println(customer.statement());
	}
	
	
	
}
