package mastermind.views;

import mastermind.models.Game;

public class WithGameView extends ConsoleView {

	protected Game game;

	WithGameView(Game game) {
		assert game != null;
		
		this.game = game;
	}
}
