package tdd.aula08.amarelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestShoppingCart {

	private Book book25;
	private Book book45;
	private ShoppingCart cart;
	
	@BeforeEach
	private void ini() {
		cart = new ShoppingCart();
		book45 = new Book();
		book45.setPreco(45.0);
		
		book25 = new Book();
		book25.setPreco(25.0);		
	}
	
	@Test
	void testGetTotalVazio() {
		assertEquals(0.0, cart.getTotal()); 
	}
	
	@Test
	void testAddOneBookGetTotal() {
		cart.add(book45);
		assertEquals(45.0, cart.getTotal()); 
	}
	
	@Test
	void testAddTwoBooksGetTotal() {
		cart.add(book45);
		cart.add(book25);
		assertEquals(70.0, cart.getTotal()); 
	}
	
	@Test
	void testRemoveBookCartEmpty() {
		assertThrows(NullPointerException.class, () -> {cart.removeBook(book25);});
	}
	
	@Test
	void testRemoveBookGetTotal() {
		cart.add(book45);
		cart.add(book25);
		cart.removeBook(book45);
		assertEquals(25.0, cart.getTotal());		
	}
	

	@Test
	void testAmountBooksEmptyCart() {
		assertEquals(0, cart.getAmountBooks());
	}
	
	@Test
	void testAmountBooks() {
		cart.add(book25);
		cart.add(book45);
		assertEquals(2, cart.getAmountBooks());		
	}

}
