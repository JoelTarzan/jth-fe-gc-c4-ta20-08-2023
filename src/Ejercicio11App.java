import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Porfavor, introduce el día de la semana.\nNo uses acentos.");
		dia = dia.toLowerCase();

		switch (dia) {
			case "lunes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un día laboral.");
				break;
				
			case "martes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un día laboral.");
				break;
				
			case "miercoles":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un día laboral.");
				break;
				
			case "jueves":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un día laboral.");
				break;
				
			case "viernes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un día laboral.");
				break;
				
			case "sabado":
				JOptionPane.showMessageDialog(null, "El " + dia + " no es un día laboral.");
				break;
				
			case "domingo":
				JOptionPane.showMessageDialog(null, "El " + dia + " no es un día laboral.");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "El día introducido no es correcto.");
				break;
		}
		
	}

}