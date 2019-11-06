package fr.runadium.premier;

public class SumOfPremier {
	
	private SumOfPremier() {}
	
	public static int SumOfPremierSequence(int input) {
		int currentNumber=0;
		int counterOfDemandedSequence=0;
	    int sumResult=0;
	   
	 if(input==0) {
		 throw new IllegalArgumentException("Your sum is equal to zero!!");
	 }
	 else if(input<0){
		 throw new IllegalArgumentException("Negative Input!! you need to enter a positive one!");
	 }
	 else {
		   while(counterOfDemandedSequence<input) {				
				if(Number.isPremier(currentNumber)) {
					counterOfDemandedSequence++; 
					sumResult=sumResult+currentNumber;
				}
				currentNumber++;
			}
	   return sumResult;
	   }
	 }
}
