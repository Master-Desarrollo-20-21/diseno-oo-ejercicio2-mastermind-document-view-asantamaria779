package mastermind.views;

import mastermind.models.Game;

public abstract class View extends WithGameView {

	public View(Game game) {
		super(game);
	}

	public void interact() {
		this.start();
		do {
			this.play();
		} while (this.isResumed());
	}
	
	protected abstract void start();

    protected abstract void play();

    protected abstract boolean isResumed();	

}
