import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {

		String num1String = JOptionPane.showInputDialog("Porfavor, introduce el primer n�mero. (Sin decimales)");
		String num2String = JOptionPane.showInputDialog("Porfavor, introduce el segundo n�mero. (Sin decimales)");
		String operador = JOptionPane.showInputDialog("Porfavor, introduce un operador.\nSuma +\nResta -\nMultiplicaci�n *\nDivisi�n /\nPotencia ^\nResto %");

		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);
		int resultado = 0;

		switch (operador) {
			case "+":
				resultado = num1 + num2;
				JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + resultado);
				break;
	
			case "-":
				resultado = num1 - num2;
				JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resultado);
				break;
	
			case "*":
				resultado = num1 * num2;
				JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + resultado);
				break;
	
			case "/":
				resultado = num1 / num2;
				JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + resultado);
				break;
	
			case "^":
				resultado = (int) Math.pow(num1, num2);
				JOptionPane.showMessageDialog(null, num1 + " ^ " + num2 + " = " + resultado);
				break;
	
			case "%":
				resultado = num1 % num2;
				JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + resultado);
				break;
	
			default:
				JOptionPane.showMessageDialog(null, "El operador introducido no es correcto.");
				break;
			}
	}

}