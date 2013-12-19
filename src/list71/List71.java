package list71;

import java.awt.Graphics;

class Point{ /*Pointクラス*/
	int x=0,y=0;
	
	void setData(int x0,int y0){ /*setDataメソッド*/
		x= x0; y=y0;
}		
	void draw(Graphics g){ /*drawメソッド*/
		g.fillOval(x-3, y-3, 6, 6);
	}

}
