package com.qjm.diedaiqi;

public class TCLTelevision implements Television{
	private Object[] obj= {"TCL-1","TCL-2","TCL-3","TCL-4","TCL-5","TCL-6","TCL-7","TCL-8"};
	class TCLIterator implements TVIterator{
		private int currentIndex=0;
		@Override
		public void setChannel(int i) {
			// TODO 自动生成的方法存根
			currentIndex=i;
		}

		@Override
		public void next() {
			// TODO 自动生成的方法存根
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		
		}

		@Override
		public void previous() {
			// TODO 自动生成的方法存根
			if(currentIndex>0) {
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			// TODO 自动生成的方法存根
			 return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO 自动生成的方法存根
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO 自动生成的方法存根
			return currentIndex==0;
		}
		
	}
	@Override
	public TVIterator createIterator() {
		// TODO 自动生成的方法存根
		return new TCLIterator();
	}
}
