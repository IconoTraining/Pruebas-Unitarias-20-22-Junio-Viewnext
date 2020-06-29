import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CustomerTest {

	@Test
	void setAgeWithNegativeAgeThrowsException() {
		Customer customer = new Customer();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> customer.setAge(-1));
		assertEquals("No puede ser un número negativo", exception.getMessage());
	}

	@Test
	void setPositiveAge() {
		Customer customer = new Customer();
		customer.setAge(3);
		assertEquals(3, customer.getAge());
	}

//	@ParameterizedTest
//	@ValueSource(ints = {15,40,50,0})
//	void testSetAgePositives(int age) {
//		Customer customer = new Customer();	
//		customer.setAge(age); 
//		assertEquals(age, customer.getAge()); 
//	}
//	
//	@ParameterizedTest
//	@ValueSource(ints = {-1,-5})
//	void testSetAgeNegatives(int age) {
//		Customer customer = new Customer();	
//		assertThrows(IllegalArgumentException.class, () -> customer.setAge(age)); 
//	}

}
