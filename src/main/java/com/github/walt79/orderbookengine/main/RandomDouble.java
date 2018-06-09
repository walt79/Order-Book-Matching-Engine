package com.github.walt79.orderbookengine.main;

public class RandomDouble {

	final int MAX = 4096;
	private double[] randoms = new double[MAX];
	
	public void initialize() {
		for(int i=0; i<MAX; i++) {
			randoms[i] = getRandom(); 
		}
	}

	int counter = 0;
	
	public double nextInt() {
		if(counter == MAX) {
			counter = 0;
		}
		else {
			++counter;
		}
		
		return randoms[counter];
	}
	
	private double getRandom()
	{
		return Double.valueOf(Math.random() * 100);
	}
	
	public double nextDouble() {
		if(counter == MAX-1) {
			counter = 0;
		}
		else {
			++counter;
		}
		
		return randoms[counter];
	}
	
}
