import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snowman {

	public static void main(String[] args) {
		JFrame outLine = new JFrame("Snowman");
		outLine.setVisible(true);
		outLine.setSize(600,400);
		SnowmanFrame panel = new SnowmanFrame();
		outLine.add(panel);
	}

}
	class SnowmanFrame extends JPanel {

	
	
	@Override
	protected void paintComponent(Graphics Graph) {
		Random random = new Random();
		int height = this.getHeight();
		int width = this.getWidth();
		double snowmanHeight = height * .75;
		
		super.paintComponent(Graph);
		Graphics2D Graph2 = (Graphics2D) Graph;
		Color CC = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		Graph2.setColor(CC);
		Graph2.drawOval((int)((width/2)-snowmanHeight/4), (int)(height/2), (int)(snowmanHeight/2), (int)(snowmanHeight/2));
		CC = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		Graph2.setColor(CC);
		Graph2.drawOval((int)((width/2)-((snowmanHeight/2)*2/3)/2),(int)((height/2)-((snowmanHeight/2)*2/3)),(int)((snowmanHeight/2)*2/3),(int)((snowmanHeight/2)*2/3));
		CC = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
		Graph2.setColor(CC);
		
		int x = (int)((snowmanHeight/2)*1/3);
		int y = (int)((snowmanHeight/2)*1/3);
		
		Graph2.drawOval((int)((width/2)-((snowmanHeight/2)*1/3)/2),(int)((height/2)-((snowmanHeight/2)*2/3)-((snowmanHeight/2)*1/3)),x,y);
		Graph2.setColor(Color.black);
		Graph2.fillOval((int)((width/2) - x *.20), (int)(y+(y*.25)),(int)(((height/2)-((snowmanHeight/2)*2/3)-((snowmanHeight/2)*1/3))/10),(int)(((height/2)-((snowmanHeight/2)*2/3)-((snowmanHeight/2)*1/3))/10));
		Graph2.fillOval((int)((width/2) + x *.20), (int)(y+(y*.25)),(int)(((height/2)-((snowmanHeight/2)*2/3)-((snowmanHeight/2)*1/3))/10),(int)(((height/2)-((snowmanHeight/2)*2/3)-((snowmanHeight/2)*1/3))/10));
		Graph2.drawLine((int)(width*.46), (int)(height*.32),(int)(width*0.4),(int)(height*0.2));
		Graph2.drawLine((int)(width*.54), (int)(height*.32),(int)(width*0.65),(int)(height*0.2));
		
	}
	}
	