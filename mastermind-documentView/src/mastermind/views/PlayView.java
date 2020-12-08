package mastermind.views;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;

public class PlayView extends WithGameView {
	
	private GameView gameView;
	private ProposedCombinationView proposedCombinationView;

	
	PlayView (Game game) {
		super(game);
		this.gameView = new GameView(this.game);
		this.proposedCombinationView = new ProposedCombinationView();
	}
	
	public void interact() {
		boolean isWinner=false;
		do {
			this.gameView.show();
			ProposedCombination proposedCombination = this.proposedCombinationView.read();
			Result result=new Result(proposedCombination);
			result.check(this.game.getSecretCombination());
			this.game.setResults(result,this.game.getNumberOfAttempts());
			this.game.setNumberOfAttempts(this.game.getNumberOfAttempts()+1);
			isWinner=result.isWinner();
		} while (!(this.game.getNumberOfAttempts() == this.game.getMaxAttempts() || isWinner));
		this.gameView.show();
		if (isWinner) {
			this.console.writeln(Message.PLAYER_WIN.getMessage());
		}
		else {
			this.console.writeln(Message.PLAYER_LOST.getMessage());
		}
	}
	
}
