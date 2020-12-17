package mastermind.views.console;

import mastermind.models.Game;
import mastermind.types.Message;
import mastermind.views.WithGameView;
import utils.Console;

public class GameView extends WithGameView {
		
	private final ResultView resultView;
	private final SecretCombinationView secretCombinationView;
	
	protected GameView(Game game) {
		super(game);
		this.resultView = new ResultView();
		this.secretCombinationView = new SecretCombinationView();
	}

	protected void show() {
		Console.getInstance().writeln(Message.NUMBER_ATTEMPTS.getMessage(this.game.getNumberOfAttempts()));
		this.secretCombinationView.show();
		for(int i=0;i<this.game.getNumberOfAttempts();i++) {
			this.resultView.show(this.game.getResult(i));
		}
	}
}
