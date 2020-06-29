import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class DNITest {
	
	@BeforeAll
	static void initAll() {
		System.out.println("@BeforeAll");
	}
	
	@BeforeEach
	void init() {
	  	// Se ejecuta antes de CADA test
		System.out.println("@BeforeEach");
	}
	  
	@AfterEach
	void tearDown() {
	  	// Se ejecuta después de CADA test
		System.out.println("@AfterEach");
	}
	
	@AfterAll
	static void tearDownAll() {
	  	System.out.println("@AfterAll");
	}

	@ParameterizedTest
	@CsvSource({
		"15454423, X",
		"15454424, B",
		"24391541, H",
		"43253425, Q",
		"24391544, K",
		"70878790, N",
		"39696838, B",
		"23,       T", 
		"10101010, P",
		"10101020, H",
        "12345678, Z",
		"11111116, T",
		"11111117, R",
		"11111118, W",
		"11111119, A",
		"11111120, G",
		"11111121, M",
		"11111122, Y",
		"11111123, F",
		"11111124, P",
		"11111125, D",
		"11111126, X",
		"11111127, B",
		"11111128, N",
		"11111129, J",
		"11111130, Z",
		"11111131, S",
		"11111132, Q",
		"11111133, V",
		"11111134, H",
		"11111135, L",
		"11111136, C",
		"11111137, K",
		"11111138, E"
	})
  	void calcularLetra(int value, char expected) {
		DNI dni = new DNI();
		char actual = dni.calcularLetra(value);
		assertEquals(expected, actual, () -> "Para el dni " + value + " corresponde la letra " + expected);
	}
	
}
