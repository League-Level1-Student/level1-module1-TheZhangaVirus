package _04_popcorn;

import _04_popcorn.Popcorn;
import _04_popcorn.Microwave;
import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {
		

		Microwave microwave = new Microwave();
		
		String num = JOptionPane.showInputDialog("how many minutes should you heat this popcorn for");
		int numb = Integer.parseInt(num);
		microwave.setTime(numb);
		
		String flavor = JOptionPane.showInputDialog("what flavor");
		Popcorn popcorn = new Popcorn(flavor);
		
		microwave.putInMicrowave(popcorn);
		
		microwave.startMicrowave();
		
	}
	
}
