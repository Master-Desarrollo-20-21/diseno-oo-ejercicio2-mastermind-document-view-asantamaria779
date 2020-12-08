package mastermind.views;
import mastermind.models.ProposedCombination;

public class ProposedCombinationView extends ConsoleView {
	
	public ProposedCombinationView () {
		super();
	}
		
	public ProposedCombination read() {
		String colors;
		do {
			colors = this.console.readString(Message.PROPOSE_COMBINATION.getMessage());
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
	
	public void show(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		this.console.write(proposedCombination.getColors());
	}	
}
