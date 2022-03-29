package main.java.calc.model;

public enum Base {
	
	DECIMAL(10), BINARIO(2);
	
	private int base;
	
	Base(int base) {
		this.base=base;
	}

	public int getBase() {
		return base;
	}
	
}
