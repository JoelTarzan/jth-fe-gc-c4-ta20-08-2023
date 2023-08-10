import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		
		String numVentasString = JOptionPane.showInputDialog("Porfavor, introduce el número de ventas");
		int numVentas = Integer.parseInt(numVentasString);
		double sumaTotalVentas = 0;
		
		for (int i = 0; i < numVentas; i++) {
		
			String ventaString = JOptionPane.showInputDialog("Porfavor, introduce de cuanto ha sido la venta");
			double venta = Double.parseDouble(ventaString);
			sumaTotalVentas += venta;
		}
		
		JOptionPane.showMessageDialog(null, "El total de ventas es: " + sumaTotalVentas + " €");

	}

}