import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
class PolygonFlag extends JFrame{
    PolygonFlag(){
        setSize(1000,900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g){
        int x1[] = {300, 350, 470};
		int y1[] = {280, 120, 280};
		
		g.setColor(Color.GREEN);
		g.fillPolygon(x1,y1,3);

		int x2[] = {500, 650, 570};
		int y2[] = {280, 120, 280};

		g.setColor(Color.BLUE);
		g.drawPolygon(x2,y2,3);
		
		g.setColor(Color.BLACK);
		g.fillRect(10,20,10,400);
		
		int x[]={20,200,100,240,20,20};
		int y[]={20,150,150,300,300,20};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,6);
		
		int xx[]={30,170,75,215,30,30};
		int yy[]={40,140,140,290,290,35};
		g.setColor(Color.red);
		g.fillPolygon(xx,yy,6);
		
		g.setColor(Color.WHITE);
		g.fillArc(50,80,40,40,0,-180);
		
		g.fillOval(50,200,50,50);
		}
    public static void main(String[] args){
        new PolygonFlag();
        
    }
}
