import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		
		String radio = JOptionPane.showInputDialog("Porfavor, introduce el radio del círculo en centímetros.");
		double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + area + " cm2");
	}

}