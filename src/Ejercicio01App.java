public class Ejercicio01App {

	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 16;
		
		// Primera prueba
		mayorOIguales(num1, num2);
		
		// Segunda prueba
		num1 = 36;
		num2 = 36;
		mayorOIguales(num1, num2);
		
		// Tercera prueba
		num1 = 24;
		num2 = 6;
		mayorOIguales(num1, num2);
		
	}
	
	public static void mayorOIguales(int num1, int num2) {
		
		if (num1 == num2) {
			System.out.println("Los números son: " + num1 + " y " + num2);
			System.out.println(num1 + " y " + num2 + " son iguales");
			System.out.println();
			
		} else {
			System.out.println("Los números son: " + num1 + " y " + num2);
			System.out.println("El número mas grande es: " + Math.max(num1, num2));
			System.out.println();
		}
	}

}