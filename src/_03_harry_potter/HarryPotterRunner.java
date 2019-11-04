package _03_harry_potter;

import _03_harry_potter.HarryPotter;

public class HarryPotterRunner {

	public static void main(String[] args) {
		
		HarryPotter potter = new HarryPotter();
		potter.makeInvisible(true);
		potter.spyOnSnape();
		potter.makeInvisible(false);
		potter.castSpell("stupefy");
		
	}
	
}
