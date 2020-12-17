package mastermind.views.console;

import mastermind.models.Result;
import mastermind.types.Message;
import utils.Console;

public class ResultView {

	protected void show(Result result) {
		assert result != null;
		
		new ProposedCombinationView().show(result.getProposedCombination());
		String message = Message.RESULT.getMessage(result.getNumberOfBlacks(),result.getNumberOfWhites());
		Console.getInstance().writeln(message);
	}		
}
