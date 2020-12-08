package mastermind;

import mastermind.models.Game;
import mastermind.views.View;

class Mastermind {	
	
	private View view;
	
	Mastermind() {
		this.view = new View(new Game());
	}
	
	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}
}
