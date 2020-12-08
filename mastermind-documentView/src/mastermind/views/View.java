package mastermind.views;

import mastermind.models.Game;

public class View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View(Game game) {
		this.startView = new StartView(game);
		this.playView = new PlayView(game);
		this.resumeView = new ResumeView(game);
	}

	public void interact() {
		this.startView.interact();
		do {
			this.playView.interact();
		} while (this.resumeView.interact());
	}
}
