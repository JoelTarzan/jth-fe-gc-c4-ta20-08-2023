import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		String numString = JOptionPane.showInputDialog("Porfavor, introduce el precio del producto.\n(Usa el punto para los decimales)");
		double num = Double.parseDouble(numString);
		
		JOptionPane.showMessageDialog(null, "El precio total con IVA es: " + (num + (num * IVA)) + " €");
		
	}

}