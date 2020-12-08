package mastermind.views;

import mastermind.models.SecretCombination;

public class SecretCombinationView extends ConsoleView {
	
	public void show () {
		String combinationEncoded="";
		for (int i=0;i<SecretCombination.length();i++) {
			combinationEncoded+='x';
		}
		this.console.write(combinationEncoded + "\n");
	}
}
