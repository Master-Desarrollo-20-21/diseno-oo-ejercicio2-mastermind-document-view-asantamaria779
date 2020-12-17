package mastermind.views.console;

import mastermind.models.SecretCombination;
import utils.Console;

public class SecretCombinationView {
	
	protected void show () {
		String combinationEncoded="";
		for (int i=0;i<SecretCombination.length();i++) {
			combinationEncoded+='x';
		}
		Console.getInstance().write(combinationEncoded + "\n");
	}
}
