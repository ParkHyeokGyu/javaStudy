import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel {
	Image back,horse;
	int x=20,y=560;
	
	// 생성자 => 메모리에 올라갈때 초기화를 담당한다
	public GameView() {
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");
		horse=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\horse.gif");
	}
	public void paint(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(horse,x,y,150,100,this);
	}
}
