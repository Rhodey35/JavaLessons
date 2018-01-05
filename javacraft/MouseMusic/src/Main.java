import org.jfugue.Pattern;
import org.jfugue.Player;

public class Main {
	
	/*
	 * This application plays a piano tune at higher or lower pitch 
	 * based on your mouse position when you press your clicker. 
	 * Volume control is from left to right..
	 * 
	 */
	
	

	public static void main(String[] args) {
		
		Player player = new Player();
	    player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
		
	    
	  /*  Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
	    Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
	    Player player = new Player();
	    player.play(p2);
	    */
	//new Thread(new MouseChecker()).start();
	
	/**
	 * The complete guide to using JFugue for 
	 * programming music for my coding needs
	 * http://www.jfugue.org/
	 * The complete guide:
	 * http://www.jfugue.org/guide.html
	 * 
	 * 
	 */
	}

}
