package basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWoldTest {

    @Test
   	void test() {
		HelloWorld myClass = new HelloWorld();
		int salida = myClass.sum(6, 11);

		assertEquals(17, salida);
	}
}
