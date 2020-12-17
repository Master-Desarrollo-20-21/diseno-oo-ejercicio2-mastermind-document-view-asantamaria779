package mastermind.views.console;

import mastermind.models.ProposedCombination;
import mastermind.types.Error;
import mastermind.types.Message;
import utils.Console;

public class ProposedCombinationView {
		
	protected ProposedCombination read() {
		String colors;
		do {
			colors = Console.getInstance().readString(Message.PROPOSE_COMBINATION.getMessage());
			if (!ProposedCombination.isValidLength(colors)) {
				new ErrorView(Error.WRONG_LENGTH_COMBINATION).writeln();
				colors="";
			}
			if (!ProposedCombination.areValidColors(colors)) {
				new ErrorView(Error.WRONG_COLORS_COMBINATION).writeln(ProposedCombination.validColors());
				colors="";
			}
		} while (colors.isEmpty());
		return new ProposedCombination(colors);
	}
	
	protected void show(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		Console.getInstance().write(proposedCombination.getColors());
	}
}
