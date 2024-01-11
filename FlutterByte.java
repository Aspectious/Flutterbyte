import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.*;

public class FlutterByte {
	private static JFrame window;
	public static void main(String[] args) {
		window = new JFrame();
		window.setSize(256, 256);
		ImageIcon img = new ImageIcon("./bf.gif");
		ImageIcon imgr = new ImageIcon("./bfr.gif");
		JLabel lbln = new JLabel(img);
		JLabel lblr = new JLabel(imgr);
		window.add(lbln);
		window.setLocation(500, 500);
		window.setUndecorated(true);
		window.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		window.setAlwaysOnTop(true);
		window.setTitle("Flutterbyte");
		window.setVisible(true);
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		while (true) {
			int dir = (int)(Math.random() * 4);
			int amt = (int)(Math.random()*5+1);
			if (dir ==0) window.setLocation(window.getX(), window.getY()-amt);
			if (dir ==1) {
				window.setLocation(window.getX()-amt, window.getY());

			}
			if (dir ==2) window.setLocation(window.getX(), window.getY()+amt);
			if (dir ==3) {
				window.setLocation(window.getX()+amt, window.getY());
			}
			
			if (window.getX()<-128) {
				window.setLocation(width, window.getY());
			} else if (window.getX()>(width-128)) {
				window.setLocation(-128, window.getY());
			}
			if (window.getY()<-128) {
				window.setLocation(window.getX(),height);
			} else if (window.getY()>(height-128)) {
				window.setLocation(window.getX(),-128);
			}
		}
	}
}
