package mastermind;

import mastermind.models.Game;
import mastermind.views.graphics.GraphicsView;

class GraphicsMastermind extends Mastermind {
	
	@Override
	protected GraphicsView createView(Game game) {
		assert game != null;
		return new GraphicsView(game);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
