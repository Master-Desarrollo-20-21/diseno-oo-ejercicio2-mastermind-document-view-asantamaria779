package mastermind.models;

import java.util.Random;
import mastermind.types.Color;

public class SecretCombination extends Combination {
	
	protected SecretCombination() {
		super(makeRandom());
	}
	
	private static String makeRandom() {
		String combination="";
		do {
			char color=Color.validColors().toCharArray()[new Random().nextInt(Color.values().length)];
			if (combination.indexOf(color)==-1) {
				combination+=color;
			}
		} while (combination.length()<Combination.length());
		return combination;
	}
		
	protected Result check(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		int numberOfBlacks=0;
		int numberOfWhites=0;
		for (int i=0;i<Combination.length();i++)
			if (proposedCombination.contains(this.getColor(i))) {
				if (proposedCombination.contains(this.getColor(i),i)) {
					numberOfBlacks++;
				} else {
					numberOfWhites++;
				}
			}
		return new Result(proposedCombination,numberOfBlacks,numberOfWhites);
	}
}
