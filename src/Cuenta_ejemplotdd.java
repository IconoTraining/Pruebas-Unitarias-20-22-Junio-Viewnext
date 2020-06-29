
public class Cuenta_ejemplotdd {

	private int saldo;
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void ingresarDinerito(int cantidad) {
		this.saldo += cantidad;
	}
}
