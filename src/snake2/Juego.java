package snake2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Juego extends JPanel {

	Snake snake = new Snake(this);
	Obstaculo obstaculo = new Obstaculo();

	public Juego() {

		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				snake.keyReleased(e);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char tecla;
				do {
				// if(Snake.pausa2()==true) {
				if (e.getKeyCode() == KeyEvent.VK_W) {
					tecla='w';
					snake.keyPressed(tecla);
					System.out.println("adios 1");
				} else if (e.getKeyCode() == KeyEvent.VK_S) {
					tecla='s';
					snake.keyPressed(tecla);
					System.out.println("adios 2");
					
				} else if (e.getKeyCode() == KeyEvent.VK_A) {
					tecla='a';
					snake.keyPressed(tecla);
					System.out.println("adios 3");
				} else if (e.getKeyCode() == KeyEvent.VK_D) {
					tecla='d';
					snake.keyPressed(tecla);
					System.out.println("adios 4");
				}
				oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo while
				
			}while();
				}
				
		});
		
		setFocusable(true);

	}

	public void move() {

		snake.move();
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);// Borrar la bola cuando cambia de posicion
		Graphics2D g2d = (Graphics2D) g;// Graficos en 2d

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);// Suaviza los
																									// bordes(En este
																									// caso al ser
																									// pixelPaint no es
																									// necesario)
		/**
		 * PINTAMOS LOS SPRITES DEL JUEGO
		 */
		snake.paint(g2d); // Pintamos la nave llamando al metodo paint de nave
		obstaculo.paint(g2d);// Pintamos los enemigos

	}

}
