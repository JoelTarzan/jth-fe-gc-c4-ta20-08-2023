import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Porfavor, introduce un n�mero entero.");
		int numParsed = Integer.parseInt(num);
		
		if (numParsed % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " es divisible entre 2");
			
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero " + num + " no es divisible entre 2");
		}

	}

}