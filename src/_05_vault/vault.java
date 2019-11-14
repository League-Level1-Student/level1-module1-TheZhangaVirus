package _05_vault;
import javax.swing.JOptionPane;
import java.util.Random;


public class vault {
	
}

class jamesBond {
	
	Random random = new Random();
	int code = random.nextInt(1000000);
			
	public void setCode() {

		int code = random.nextInt(1000000);
		
	}
	
	public void tryCode() {
		
		for(int i = 0; i < 1000000; i++) {
			if(i == code) {
				System.out.println(i);
			} else if(i > code) {
				break;
			}
		}
		
	}
	
}
