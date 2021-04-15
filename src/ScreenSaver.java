import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreenSaver {

	public static void main(String[] args) {
		JFrame outLine = new JFrame("ScreenSaver");
		outLine.setVisible(true);
		outLine.setSize(600,400);
		ScreenSaverFrame panel = new ScreenSaverFrame();
		outLine.add(panel);
	}

}

class ScreenSaverFrame extends JPanel implements ActionListener{

	
	@Override
	protected void paintComponent(Graphics Graph) {
		
			Timer t = new Timer(1000, this);
			t.start();
	
		
		
		Random Random = new Random();
		super.paintComponent(Graph);
		Graphics2D Graph2 = (Graphics2D) Graph;
		int height = this.getHeight();
		int width = this.getWidth();
		int cWidth;
		int cHeight;
		int cX;
		int cY;
		
		
		for(int i = 0; i<50; i++) {
			Color CC = new Color(Random.nextInt(255), Random.nextInt(255), Random.nextInt(255));
			cWidth = Random.nextInt(width);
			cHeight = Random.nextInt(height);
			cX = Random.nextInt(width);
			cY = Random.nextInt(height);
			
			while(cX + cWidth > width) {
				cX = Random.nextInt(width);
				cWidth = Random.nextInt(width);
			}
			while(cY + cHeight > height) {
				cY = Random.nextInt(height);
				cHeight = Random.nextInt(height);	
			}
			Graph2.setStroke(new BasicStroke(Random.nextInt(9)+1));
			Graph2.setColor(CC);
			Graph2.drawOval(cX, cY, cWidth, cHeight);
			
		}
		
		
		
	}
	 public void actionPerformed(ActionEvent event){
	        repaint();
	    }
}