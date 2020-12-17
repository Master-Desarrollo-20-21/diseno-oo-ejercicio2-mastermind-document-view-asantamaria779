package mastermind.models;

import mastermind.types.Color;

class Combination {
	
	private static final int LENGTH = 4;
	private String colors;
	
	protected Combination(String colors){
		assert colors != null;
		assert Combination.areValidColors(colors);
		
		this.colors=colors;
	}
	
	public static boolean isValidLength(String colors) {
		assert colors != null;		
		
		return colors.length()==Combination.length();
	}

	public static int length() {
		return LENGTH;
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
	
	protected char getColor(int position) {
		return this.colors.charAt(position);
	}
	
	public String getColors() {
		return this.colors;
	}
	
	protected void setColors(String colors) {
		this.colors = colors;		
	}
}
