package mastermind.models;

public class ProposedCombination extends Combination {
	
	public ProposedCombination(String colors) {
		super(colors);
	}
	
	public ProposedCombination() {
		super("");
	}
	
	public String getColors() {
		return this.colors;
	}
	
	public void setColors(String colors) {
		this.colors = colors;
		
	}
}
