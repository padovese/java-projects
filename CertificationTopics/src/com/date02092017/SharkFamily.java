package com.date02092017;

public interface SharkFamily extends HasFins{
	public default int getNumberOfFins() {
		return 8;
	}
	
	public double getLongestFinLength();
	
	public boolean doFinsHaveScales() {
		return false;
	}
}
