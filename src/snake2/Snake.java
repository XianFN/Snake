package snake2;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Snake {
	static boolean pausa;
	private Juego juego;

	private int velocidad = 1;
	int x = 300;
	int y = 300;
	int xa = 0;
	int ya = 0;

	public Snake(Juego juego) {
		this.juego = juego;
	}

	public void move() {

		x = x + xa;
		y = y + ya;

		System.out.println(x + "," + y);
		if ((x % 20 == 0) && (y % 20 == 0)) {
			
			
			System.out.println("hola");
		
		}

		// System.out.println(xa + "," + ya);

	}

	public void paint(Graphics2D g2d) {

		boolean flag = true;
		g2d.fillRect(x, y, 20, 20);
		
		int i = 0;
		while (flag) {

			g2d.drawLine(0, i, 600, i);
			g2d.drawLine(i, 0, i, 600);

			// System.out.println(i);
			i += 20;

			if (i == 600) {
				flag = false;
			}
		}
	}

	public void keyReleased(KeyEvent e) {

	}

	public void keyPressed(char t) {
		    pausa=false;
			char move= t;
			// System.out.println("holaaa");
			switch(move){
			  case 'w':
				  if ((x % 20 == 0) && (y % 20 == 0)) {
					  ya = -velocidad;
						xa = 0;
						pausa=true;
				  }
				  else {
					  System.out.println("adios 20");
					  keyPressed(move);
				  }
				  break;
			  case 's':
				  if ((x % 20 == 0) && (y % 20 == 0)) {
					  ya = velocidad;
						xa = 0;
						pausa=true;
				  }
				  else {
					  System.out.println("adios 20");
					  keyPressed(move);
				  }
				  break;
			  case 'a':
				  if ((x % 20 == 0) && (y % 20 == 0)) {
					  xa = -velocidad;
						ya = 0;
						pausa=true;
				  }
				  else {
					  System.out.println("adios 20");
					  keyPressed(move);
				  }
				  break;
			  case 'd':
				  if ((x % 20 == 0) && (y % 20 == 0)) {
					  xa = velocidad;
						ya = 0;
						pausa=true;
				  }
				  else {
					  System.out.println("adios 20");
					  keyPressed(move);
				  }
				  break;
			  default :
				  break;
			

		}
		
		

	}

	public static boolean pausa2() {
			
		return pausa;
	}

}
