package fr.runadium.premier;

public class SumPremier {
	
	
	public int sumPremier(int n) {
		Premier p=new Premier();
		int current=0;
		int counter=0;
	    int sum=0;
	    
		while(counter<n) {		
			if(p.isPremier(current)) {
				counter++;
				sum=sum+current;
			}
			current++;
		}
		if(n<0) {
			throw new IllegalArgumentException("negative number !!" );
		}
	else
	return sum;
	}
}
