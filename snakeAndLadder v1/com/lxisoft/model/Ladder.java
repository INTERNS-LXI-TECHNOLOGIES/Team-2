package com.lxisoft.model;

public class Ladder{
	int startPosition;
	int endPosition;
	public Ladder(int startPosition, int EndPosition){
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}
	
	public int getEndPosition(){
	return endPosition;
}

	public int getStartPosition(){
	return startPosition;
}
}