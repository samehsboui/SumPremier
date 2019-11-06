package fr.runadium.premier;

public class Number {

	private Number() {}
	
	public static boolean isPremier(int input) {
		boolean result = true; 
		if(input<0)
			throw new IllegalArgumentException("negative number!!");
		else if (input < 2) {
			result = false; 
			}
		else if (input != 0 && input != 1){
			for (int numberToCheckIfDividerOfInput = 2; numberToCheckIfDividerOfInput <= input/2; numberToCheckIfDividerOfInput++){
				if (input != numberToCheckIfDividerOfInput && input % numberToCheckIfDividerOfInput == 0) {
					result = false; 
					break;
					} 
				}
			}
		return result; 
		}
	
	
	
}
