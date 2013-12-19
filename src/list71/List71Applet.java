package list71;

import java.applet.Applet;
import java.awt.Graphics;

public class List71Applet extends Applet{
	public void paint(Graphics g){
		Point p1,p2;
		
		p1=new Point();
		p1.setData(50, 40);
		
		p2=new Point();
		p2.setData(150, 25);
		
		p1.draw(g);
		p2.draw(g);
	}

}
