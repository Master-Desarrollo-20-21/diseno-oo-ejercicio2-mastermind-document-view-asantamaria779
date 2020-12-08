package mastermind.models;

public class Game {

	final int MAX_ATTEMPTS = 10;
	
	int numberOfAttempts;
	SecretCombination secretCombination;
	Result[] results;
	
	public Game() {
		this.reset();
	}
	
	public void reset() {
		this.numberOfAttempts=0;
		this.secretCombination = new SecretCombination();
		this.results = new Result[10];
	}
	
	public int getMaxAttempts() {
		return this.MAX_ATTEMPTS;		
	}
	
	public int getNumberOfAttempts() {
		return this.numberOfAttempts;		
	}
	
	public Result getResult(int i) {
		assert i>=0 && i < 10;
		
		return this.results[i];
	}
	
	public SecretCombination getSecretCombination() {
		return this.secretCombination;		
	}
	
	public void setResults (Result result, int i) {
		assert result != null;
		assert i>=0 && i < 10;
		
		this.results[i] = result;		
	}
	
	public void setNumberOfAttempts(int numberOfAttemps) {
		assert numberOfAttemps >= 0 && numberOfAttempts <= MAX_ATTEMPTS;
		
		this.numberOfAttempts = numberOfAttemps;	
	}
}
