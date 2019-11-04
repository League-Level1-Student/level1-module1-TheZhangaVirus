package _02_cat;

import _02_cat.Cat;

public class CatRunner {

	public static void main(String[] args) {
		
		Cat cat = new Cat("cat");
		cat.meow();
		cat.printName();
		for(int i = 0; i < 9; i++) {
			cat.kill();
		}
		
	}
	
}
