package mastermind.views.console;

import mastermind.models.Game;
import mastermind.views.View;

public class ConsoleView extends View {
	
	private final StartView startView;
	private final PlayView playView;
	private final ResumeView resumeView;

	public ConsoleView(Game game) {
		super(game);
		this.startView = new StartView();
		this.playView = new PlayView(this.game);
		this.resumeView = new ResumeView(this.game);
	}

	@Override
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected void play(){
		this.playView.interact();
	}

	@Override
	protected boolean isResumed(){
		return this.resumeView.isResumed();
	}
}