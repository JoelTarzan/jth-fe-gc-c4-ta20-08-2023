import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Porfavor, introduce el d�a de la semana.\nNo uses acentos.");
		dia = dia.toLowerCase();

		switch (dia) {
			case "lunes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un d�a laboral.");
				break;
				
			case "martes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un d�a laboral.");
				break;
				
			case "miercoles":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un d�a laboral.");
				break;
				
			case "jueves":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un d�a laboral.");
				break;
				
			case "viernes":
				JOptionPane.showMessageDialog(null, "El " + dia + " es un d�a laboral.");
				break;
				
			case "sabado":
				JOptionPane.showMessageDialog(null, "El " + dia + " no es un d�a laboral.");
				break;
				
			case "domingo":
				JOptionPane.showMessageDialog(null, "El " + dia + " no es un d�a laboral.");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "El d�a introducido no es correcto.");
				break;
		}
		
	}

}