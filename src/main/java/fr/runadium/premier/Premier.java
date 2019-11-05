package fr.runadium.premier;

public class Premier {

	
	public boolean isPremier(int n) {
		boolean result = true; 
		if (n < 2) {
			result = false; 
			}
		else if (n != 0 && n != 1){
			for (int i = 2; i <= n/2; i++){
				if (n != i && n % i == 0) {
					result = false; 
					break;
					} 
				}
			}
		return result; 
		}
	
	
	
}
