import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JPanel;



//create a timer


/**
 * 
 * @author John Erwin, Allison Rowe, Jordan Abbatiello
 * Controller will use LinkedList to keep track of the zombies and bullets on screen.
 * In both its tick and draw method it will move the zombies and bullets accordingly and will eventually 
 * hold our collision method
 *  
 */
public class Controller extends Frame implements Runnable{
	private ArrayList<Bullet> b = new ArrayList<Bullet>();
	private ArrayList<Zombie> zombieArray = new ArrayList<Zombie>();
	private Image background;
	
	//will probably have a linked list of zombies as well
	
	Bullet TempBullet;
	//Game game; //what is the Game supposed to be?
	
	public Controller(){;
	while(Frame.open){
		;
	}
	
	}
	
	public void tick(){
		for(int i = 0; i < b.size(); i++){
			TempBullet = b.get(i);
			
			TempBullet.tick();
		}
	}
	
	public void draw(Graphics g){
		for(int i = 0; i < b.size(); i++){
			TempBullet = b.get(i);
			TempBullet.draw(g);
		}	
	}
		
	public void addBullet(Bullet bullet){
		b.add(bullet);
	}
	
	public void removeBullet(Bullet bullet){
		b.remove(bullet);
	}
	
	public void addZombie(Zombie z){
		zombieArray.add(z);
	}
	
	public void removeZombie(Zombie z){
		zombieArray.remove(z);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

//must create and initialized instance of controller in our game class
//in keyPressed method in game we must add
//if keyPressed = Space then controller.addBullet(new Bullet(p.getX, p.getY(), this));