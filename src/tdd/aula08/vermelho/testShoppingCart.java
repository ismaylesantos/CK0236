package tdd.aula08.vermelho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testShoppingCart {

	private Book book1;
	private Book book2;
	ShoppingCart cart;
	@BeforeEach
	private void init() {
		cart = new ShoppingCart();
		
		book1 = new Book();
		book1.setTitulo("Segredo");
		book1.setISBN("234");
		book1.setPreco(45.0);

		book2 = new Book();
		book2.setTitulo("Java");
		book2.setISBN("234");
		book2.setPreco(25.0);
	}
	
	@Test
	void testGetTotalVazio() {		 
		assertEquals(0.0, cart.getTotal()); 
	}
	
	@Test
	void testAddOneBookGetTotal() {		
		cart.add(book1);
		assertEquals(45.0, cart.getTotal()); 
	}
	
	@Test
	void testAddTwoBooksGetTotal() {
		cart.add(book1);
		cart.add(book2);
		assertEquals(70.0, cart.getTotal()); 
	}
	
	@Test
	void testRemoveBookCartEmpty() {
		assertThrows(NullPointerException.class, cart.removeBook(book1));
	}
	
	@Test
	void testRemoveBookGetTotal() {
		cart.add(book1);
		cart.add(book2);
		cart.removeBook(book1);
		assertEquals(25.0, cart.getTotal());		
	}
	
	@Test
	void testAmountBooksEmptyCart() {
		assertEquals(0, cart.getAmountBooks());
	}
	
	@Test
	void testAmountBooks() {
		cart.add(book1);
		cart.add(book2);
		assertEquals(2, cart.getAmountBooks());		
	}

}
