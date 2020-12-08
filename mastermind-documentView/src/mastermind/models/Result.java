package mastermind.models;

public class Result {
	
	ProposedCombination proposedCombination;
	int numberOfBlacks;
	int numberOfWhites;
	
	public Result (ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		this.proposedCombination = proposedCombination;
		this.numberOfBlacks = 0;
		this.numberOfWhites = 0;
	}
	
	public void check (SecretCombination secretCombination) {
		assert secretCombination != null;
		
		this.numberOfBlacks=secretCombination.numberCoincidencesInColourAndPosition(proposedCombination);
		this.numberOfWhites=secretCombination.numberCoincidencesInColourOnly(proposedCombination);
	}
		
	public boolean isWinner() {
		return this.numberOfBlacks==ProposedCombination.length();
	}
	
	public ProposedCombination getProposedCombination() {
		return this.proposedCombination;
	}
	
	public int getNumberOfBlacks() {
		return this.numberOfBlacks;
	}
	
	public int getNumberOfWhites() {
		return this.numberOfWhites;
	}
}
