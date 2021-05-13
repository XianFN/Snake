package snake2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainSnake {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Snake");
		Juego juego = new Juego();
		frame.add(juego);

		Toolkit mipantalla = Toolkit.getDefaultToolkit();// Guardado sistema de vemtanas nativo
		Dimension tamanioPantalla = mipantalla.getScreenSize();// Guardado la dimension de mi pantalla
		int alturaPantalla = tamanioPantalla.height;// alto
		int anchoPantalla = tamanioPantalla.width;// ancho
		frame.setLocation(anchoPantalla / 4, alturaPantalla / 32);// Marco centrado

		frame.setSize(600, 600);
		// frame.setResizable(false);// No dejamos poner en pantalla completa
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		while (true) { // Loop del juego

			juego.move();
			juego.repaint();
			Thread.sleep(20);
		}
	}

}
