package mastermind.views;

public enum Error {

	WRONG_LENGTH_COMBINATION("Wrong proposed combination length"),
	WRONG_COLORS_COMBINATION("Wrong colors, they must be: #rigthColors"),
	NULL;

	private String message;

	Error(){
	}

	Error(String message){
		assert message != null;
		
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public boolean isNull(){
		return this == Error.NULL;
	}
}