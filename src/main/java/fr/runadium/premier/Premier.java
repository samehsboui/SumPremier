package fr.runadium.premier;

public class Premier {

	
	public boolean isPremier(int n) {
		boolean isPremier = true; 
		if (n < 0) {
			isPremier = false; 
			}
		else if (n != 0 && n != 1){
			for (int i = 2; i <= n/2; i++){
				if (n != i && n % i == 0) {
					isPremier = false; 
					break;
					} 
				}
			}
		return isPremier; 
		}
	
	public int sumPremier(int n) {
		Premier p=new Premier();
		int j=0;
		int i=0;
	    int s=0;
	    
		while(i<n) {
		
		if(p.isPremier(j)) {
			i++;
		    s=s+j;
		    j++;
		}
		else {
			j++;
			}
		}
	return s;
	}
	
}
