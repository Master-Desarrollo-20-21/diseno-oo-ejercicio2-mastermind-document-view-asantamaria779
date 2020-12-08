package mastermind.views;

import mastermind.models.Game;

public class StartView extends WithGameView {
	
	StartView (Game game) {
		super(game);
	}
	
	public void interact() {
		this.console.writeln(Message.TITTLE.getMessage());
	}

}
