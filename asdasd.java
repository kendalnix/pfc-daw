import java.util.Scanner;

import javax.swing.JOptionPane;

public class lecturas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int opcion=entrada.nextInt();
		
		int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
		
		System.out.println ("Total:" + lado*lado);
		int area=(int) (Math.PI*lado);

		System.out.println ("Haciendo algunos cambios desde VSCodium y actualizándolos desde el GH-Desktiop");
		 

	}

}
