import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		
		String password = "colaKO#123";
		int intentos = 3;
		boolean passwordAcertada = false;
		
		while(!passwordAcertada && intentos > 0) {
			
			String intentoPassword = JOptionPane.showInputDialog("Porfavor, introduce la contraseña.");
			
			if (!password.equals(intentoPassword)) {
				intentos--;
				
			} else {
				passwordAcertada = true;
				JOptionPane.showMessageDialog(null, "Enhorabuena");
			}
			
		}

	}

}