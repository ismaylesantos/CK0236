package refatoracao.aula25.Refatorado;

import refatoracao.aula25.Original.Movie;

public class RentalRefatorado {

	private MovieRefatorado movie;
	private int daysRented;
	
	public RentalRefatorado (MovieRefatorado movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public double getCharge() {
		return movie.getCharge(daysRented);
	}
	
	public MovieRefatorado getMovie() {
		return movie;
	}
	
	public int getDaysRented() {
		return daysRented;
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);		
	}
}
