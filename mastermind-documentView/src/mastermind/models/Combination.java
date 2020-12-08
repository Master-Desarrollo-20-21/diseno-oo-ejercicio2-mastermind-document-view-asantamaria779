package mastermind.models;

class Combination {
	
	protected static final int LENGTH = 4;
	
	protected String colors;
	
	Combination(String colors){
		assert colors != null;
		assert Combination.areValidColors(colors);
		
		this.colors=colors;
	}
		
	public static boolean isValidLength(String colors) {
		assert colors != null;		
		
		return colors.length()==LENGTH;
	}

	public static boolean areValidColors(String colors) {
		assert colors != null;
		
		for(int i=0;i<colors.length();i++) {
			if (!Color.isValid(colors.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static String validColors() {
		
		return Color.validColors();
	}
	
	public static int length() {
		return LENGTH;
	}
}
