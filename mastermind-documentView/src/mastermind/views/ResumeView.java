package mastermind.views;

import mastermind.models.Game;
import utils.YesNoDialog;

public class ResumeView extends WithGameView {

	ResumeView(Game game) {
		super(game);
	}

	public boolean interact() {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed) {
			this.game.reset();
		}
		return isResumed;
	}

}
