package tdd.aula08.verde;

import java.util.ArrayList;

import org.junit.jupiter.api.function.Executable;
//adicionar um livro no carrinho; retornar o preço total dos livros no carrinho; e remover um livro do carrinho

public class ShoppingCart {
	
	private ArrayList<Book> items = new ArrayList<Book>();
	
	public double getTotal() {
		if (items.size() == 0) 
			return 0.0;
		double total = 0;
		for (Book book : items) {
			total += book.getPreco();
		}
		return total;
	}

	public void removeBook(Book book1) {
		if (items.size() == 0) 
			throw new NullPointerException();
		else
			items.remove(book1);		
	}

	public void add(Book book2) {
		items.add(book2);		
	}

	public Integer getAmountBooks() {
		if(items.size() == 0)
				return 0;
		else
		   return items.size();		
	}
	

}
