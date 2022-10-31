package ventana;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class ventana extends JFrame {

	public ventana() {
		setSize(600, 600); // Se asigna Alto y Ancho a la ventana
		setTitle("Formulario para 'Red Flag' de Depresion"); // Se asigna Titulo a la ventana
		setLocationRelativeTo(null); // Se centra al tamaño de la ventana
		this.getContentPane().setBackground(new Color(9, 9, 9)); // A la ventana se le asigna el color #090909
		iniciar_componentes();

		setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina el programa
	}

	private void iniciar_componentes() {
		JPanel panel = new JPanel(); // Crea panel
		this.getContentPane().add(panel); // Se agrega el panel a la ventana
		panel.setBackground(new Color(9, 9, 9));
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Hola, Biembenidos al Formilario");
		panel.add(etiqueta);
	}

}