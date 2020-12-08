package mastermind.models;

import java.util.Random;
//import utils.Console;

public class SecretCombination extends Combination {
	
	SecretCombination() {
		super(makeRandom());
	}
	
	private static String makeRandom() {
		String combination="";
		do {
			char colour=Color.validColors().toCharArray()[new Random().nextInt(Color.values().length)];
			if (combination.indexOf(colour)==-1) {
				combination+=colour;
			}
		} while (combination.length()<LENGTH);
		//Console.getInstance().writeln("\nCOMBINACIÓN SECRETA: "+combination); //For tests proposes only
		return combination;
	}

	public int numberCoincidencesInColourAndPosition(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		int numberOfCoincidences=0;
		for (int i=0;i<LENGTH;i++)
			if (this.colors.charAt(i) == proposedCombination.colors.charAt(i)) {
				numberOfCoincidences++;
			}
		return numberOfCoincidences;
	}

	public int numberCoincidencesInColourOnly(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		int numberOfCoincidences=0;
		for (int i=0;i<LENGTH;i++) {
			for (int j=0;j < LENGTH;j++)
				if ((this.colors.charAt(i)==proposedCombination.colors.charAt(j)) && (i!=j)) {
					numberOfCoincidences++;
				}
		}
		return numberOfCoincidences;
	}
}
