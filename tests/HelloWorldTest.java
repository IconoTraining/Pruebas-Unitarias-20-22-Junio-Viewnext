import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld myClass = new HelloWorld();
		int salida = myClass.sum(6, 11);
		
		assertEquals(17, salida);
	}

}
