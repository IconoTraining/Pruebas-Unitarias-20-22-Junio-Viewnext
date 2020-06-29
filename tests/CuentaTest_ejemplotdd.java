import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest_ejemplotdd {

	
	@Test
	void alCrearCuentaElSaldoEsCero() {
		
		Cuenta_ejemplotdd cuenta = new Cuenta_ejemplotdd();
		assertEquals(0, cuenta.getSaldo());
	}
	
//	Al ingresar 3000 en cuenta con 100 el saldo es 3100
	
	@Test
	void ingresoEnCuentaVacia() {
		
		Cuenta_ejemplotdd cuenta = new Cuenta_ejemplotdd();
		cuenta.ingresarDinerito(100);
		assertEquals(100, cuenta.getSaldo());
	}
	
	@Test
	void ingresoEnCuentaVacia2() {
		
		Cuenta_ejemplotdd cuenta = new Cuenta_ejemplotdd();
		cuenta.ingresarDinerito(3000);
		assertEquals(3000, cuenta.getSaldo());
	}
	
	@Test
	void ingresoEnCuentaConSaldo() {
		
		Cuenta_ejemplotdd cuenta = new Cuenta_ejemplotdd();
		cuenta.ingresarDinerito(100);
		
		cuenta.ingresarDinerito(3000);
		assertEquals(3100, cuenta.getSaldo());
	}

}
