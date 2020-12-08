package mastermind.views;

import mastermind.models.Game;

public class GameView extends WithGameView {
		
	private ResultView resultView;
	private SecretCombinationView secretCombinationView;
	
	GameView(Game game) {
		super(game);
		this.resultView = new ResultView();
		this.secretCombinationView = new SecretCombinationView();
	}

	public void show() {
		this.console.writeln(Message.NUMBER_ATTEMPTS.getMessage(this.game.getNumberOfAttempts()));
		this.secretCombinationView.show();
		for(int i=0;i<this.game.getNumberOfAttempts();i++) {
			this.resultView.show(this.game.getResult(i));
		}
	}
}
