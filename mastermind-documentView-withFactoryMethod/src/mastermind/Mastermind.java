package mastermind;

import mastermind.models.Game;
import mastermind.views.View;

abstract class Mastermind {	
	
	protected final View view;
	protected final Game game;
	
	protected Mastermind() {
		this.game = new Game();
		this.view = this.createView(this.game);
	}
	
	protected abstract View createView(Game game);

	protected void play() {
		this.view.interact();
	}	
}

