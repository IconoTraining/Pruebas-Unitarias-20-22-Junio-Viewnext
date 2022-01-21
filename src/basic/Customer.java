package basic;

public class Customer {
    
	private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("No puede ser un número negativo");
        }
        this.age = age;
    }

	public int getAge() {
		return age;
	}
	
}