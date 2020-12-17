package mastermind.models;

public class Game {

	private final int MAX_ATTEMPTS = 10;
	private int numberOfAttempts;
	private boolean isWinner;
	private SecretCombination secretCombination;
	private Result[] results;
	
	public Game() {
		this.reset();
	}
	
	public void reset() {
		this.numberOfAttempts=0;
		this.secretCombination = new SecretCombination();
		this.results = new Result[10];
		this.isWinner = false;
	}
	
	public Result getResult(int i) {
		assert i>=0 && i < 10;
		
		return this.results[i];
	}
	
	public void increaseNumberOfAttempts() {
		this.numberOfAttempts++;		
	}

	public boolean isOver() {
		return this.numberOfAttempts == this.MAX_ATTEMPTS || this.isWinner();
	}
	
	public boolean isWinner() {
		return this.isWinner;
	}

	public void checkWinner() {
		this.isWinner = this.results[numberOfAttempts].isWinner();
	}
	
	public int getNumberOfAttempts() {
		return this.numberOfAttempts;
	}

	public void addResult(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		Result result = this.secretCombination.check(proposedCombination);
		results[this.numberOfAttempts] = result;
	}
}
