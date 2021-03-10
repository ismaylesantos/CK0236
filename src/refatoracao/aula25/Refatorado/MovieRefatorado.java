package refatoracao.aula25.Refatorado;

import refatoracao.aula25.Original.Movie;

public class MovieRefatorado {
	
	public static final int REGULAR = 0;
	public static final int CHILDREN = 2;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;
	
	public MovieRefatorado(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode (int priceCode) {
		this.priceCode = priceCode;
	}
	
	public double getCharge (int daysRented) {
		double amount = 0;
		switch (getPriceCode()) {
		case REGULAR:
			amount +=2;
			if (daysRented > 2)
				amount += (daysRented - 2) * 1.5;
			break;
		case NEW_RELEASE:
			amount += daysRented * 3;
			break;
		case CHILDREN:
			amount += 1.5;
			if(daysRented > 3)
				amount += (daysRented - 3) * 1.5;
			break;
			
		}
		return amount;
	}

	public int getFrequentRenterPoints(int daysRented) {
		if (priceCode == NEW_RELEASE && daysRented > 1)
			return 2;
		return 1;
	}
	
}
