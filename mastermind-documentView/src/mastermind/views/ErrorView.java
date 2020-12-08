package mastermind.views;

public class ErrorView extends ConsoleView {
	
	private Error error;
	
	ErrorView (Error error) {
		assert error != null;
		
		this.error = error;
	}
	
	public void writeln(String rigthColors) {
		assert this.error == Error.WRONG_COLORS_COMBINATION;
		
		String message = error.getMessage().replaceAll("#rigthColors",rigthColors);
		this.console.writeln(message);
	}

	public void writeln() {
		if (!this.error.isNull()) {
			this.writeln(error.getMessage());
		}	
	}	
}
