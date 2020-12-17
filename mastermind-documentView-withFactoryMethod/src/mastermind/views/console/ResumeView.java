package mastermind.views.console;

import mastermind.models.Game;
import mastermind.types.Message;
import mastermind.views.WithGameView;

public class ResumeView extends WithGameView {

	protected ResumeView(Game game) {
		super(game);
	}

	protected boolean isResumed() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed) {
			this.game.reset();
		}
		return isResumed;
	}
}
