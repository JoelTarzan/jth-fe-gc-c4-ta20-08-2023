import javax.swing.JOptionPane;

public class Ejercicio03App {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Porfavor, introduce tu nombre.");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		
	}

}