package tdd.aula08.amarelo;

import java.util.ArrayList;
//adicionar um livro no carrinho; retornar o preço total dos livros no carrinho; e remover um livro do carrinho

public class ShoppingCart {

	private ArrayList<Book> items; //changed 
	
	public ShoppingCart() {
		items = new ArrayList<>(); //changed 
	}
	
	public double getTotal() {
		if (items.isEmpty()) //changed 
			return 0.0;
		
		double total = 0;
		for (Book book : items) {
			total += book.getPreco();
		}
		return total;
	}

	public void removeBook(Book book) { //changed
		if (items.isEmpty()) //changed 
			throw new NullPointerException("Lista já estava vazia"); //changed
		else
			items.remove(book);		
	}

	public void add(Book newBook) { //changed
		items.add(newBook);		
	}
	
	public Integer getAmountBooks() {
		return items.size();		
	}
	
	

}
