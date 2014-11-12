package javaProject;

public class smallestElement {

	public static int smallestCoin(int[] pocket){
		int smallestCoin = pocket[0];
		
		for(int i = 0; i<pocket.length; i++){
			if(pocket[i] <= smallestCoin){
				smallestCoin = pocket[i];
			}
		}
		
		return smallestCoin;
	}
	
	public static void main(String[] args){
		int[] pocket = {100, 50, 1, 25, 1, 5};
		String x = String.valueOf(smallestCoin(pocket));
		System.out.println("The smallest coin in the pocket is: $"+x);
		
	}
	
}
