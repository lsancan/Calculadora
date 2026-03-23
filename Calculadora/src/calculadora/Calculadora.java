package calculadora;

public class Calculadora {
	
	// Versión 1.0.0 - Operaciones matemáticas básicas completadas

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public double dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir por 0.");
		}
		return (double)a/b;
	}
}
