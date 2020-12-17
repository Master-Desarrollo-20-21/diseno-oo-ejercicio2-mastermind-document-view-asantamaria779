package mastermind.views.console;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.types.Message;
import mastermind.views.WithGameView;
import utils.Console;

public class PlayView extends WithGameView {
	
	private final GameView gameView;
	private final ProposedCombinationView proposedCombinationView;

	protected PlayView (Game game) {
		super(game);
		this.gameView = new GameView(this.game);
		this.proposedCombinationView = new ProposedCombinationView();
	}
	
	protected void interact() {
		do {
			this.gameView.show();
			ProposedCombination proposedCombination = this.proposedCombinationView.read();
			this.game.addResult(proposedCombination);
			this.game.checkWinner();
			this.game.increaseNumberOfAttempts();
		} while (!(this.game.isOver()));
		this.gameView.show();
		this.showFinalResult();
	}
	
	private void showFinalResult() {
		if (this.game.isWinner()) {
			Console.getInstance().writeln(Message.PLAYER_WIN.getMessage());
		}
		else {
			Console.getInstance().writeln(Message.PLAYER_LOST.getMessage());
		}	
	}
}
