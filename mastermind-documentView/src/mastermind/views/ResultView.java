package mastermind.views;

import mastermind.models.Result;

public class ResultView extends ConsoleView {

	public void show(Result result) {
		assert result != null;
		
		new ProposedCombinationView().show(result.getProposedCombination());
		String message = Message.RESULT.getMessage(result.getNumberOfBlacks(),result.getNumberOfWhites());
		this.console.writeln(message);
	}		
}
