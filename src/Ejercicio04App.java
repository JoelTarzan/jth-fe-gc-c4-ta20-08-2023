import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		
		String radio = JOptionPane.showInputDialog("Porfavor, introduce el radio del c�rculo en cent�metros.");
		double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
		JOptionPane.showMessageDialog(null, "El �rea del circulo es: " + area + " cm2");
	}

}