package com.qjm.diedaiqi;

public interface TVIterator {
	//µü´úÆ÷±¾Éí
	void setChannel(int i);
	void next();
	void previous();
	boolean isLast();
	Object currentChannel();
	boolean isFirst();
	
}
