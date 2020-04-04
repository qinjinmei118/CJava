package com.qjm.diedaiqi;

public class TCLTelevision implements Television{
	private Object[] obj= {"TCL-1","TCL-2","TCL-3","TCL-4","TCL-5","TCL-6","TCL-7","TCL-8"};
	class TCLIterator implements TVIterator{
		private int currentIndex=0;
		@Override
		public void setChannel(int i) {
			// TODO �Զ����ɵķ������
			currentIndex=i;
		}

		@Override
		public void next() {
			// TODO �Զ����ɵķ������
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		
		}

		@Override
		public void previous() {
			// TODO �Զ����ɵķ������
			if(currentIndex>0) {
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			// TODO �Զ����ɵķ������
			 return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO �Զ����ɵķ������
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO �Զ����ɵķ������
			return currentIndex==0;
		}
		
	}
	@Override
	public TVIterator createIterator() {
		// TODO �Զ����ɵķ������
		return new TCLIterator();
	}
}
