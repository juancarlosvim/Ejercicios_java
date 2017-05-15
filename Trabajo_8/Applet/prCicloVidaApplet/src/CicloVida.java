import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CicloVida extends Applet {
	
	
	
	public void init(){
		
		System.out.println("init");
	}
	
	public void start(){
		System.out.println("start");
	}
	
	public void stop(){
		
		System.out.println("stop");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void paint(Graphics g){
		System.out.println("paint");
		
		int pos_x = 10;
		int pos_y = 10;
		
		g.setColor(Color.GRAY);
		
		for(int i=1; i<=5;i++){
			for(int j=1;j<=10;j++){
				g.fillRect(pos_x, pos_y, 10, 10);
				
				pos_x +=20;
			}
			
			pos_x = (i%2==0)? 10:20;  //ig si tanto % 2 ==0 la posicion es la 10 y si no la 20
			pos_y += 10;
		}
	}
}
