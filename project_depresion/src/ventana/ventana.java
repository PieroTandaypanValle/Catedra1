package ventana;

import javax.swing.JFrame;
import java.awt.Color;

public class ventana extends JFrame {

	public ventana() {
		setSize(550,550); // Se asigna Alto y Ancho a la ventana
		setTitle("Formulario para 'Red Flag' de Depresion"); // Se asigna Titulo a la ventana
		setLocationRelativeTo(null); // Se centra al tamaño de la ventana
		this.getContentPane().setBackground(new Color(9,9,9)); // A la ventana se le asigna el color #090909
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina el programa
	}
}