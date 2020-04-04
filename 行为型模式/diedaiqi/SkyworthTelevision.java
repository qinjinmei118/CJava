package com.qjm.diedaiqi;

public class SkyworthTelevision implements Television{
	private Object[] obj= {"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5","CCTV-6","CCTV-7","CCTV-8"};
	@Override
	public TVIterator createIterator() {
		// TODO 自动生成的方法存根
		return new SkyworthIterator();
	}
	//创建Skyworth遥控器
	private class SkyworthIterator implements TVIterator{
		//管理下标问题
		private int currentIndex=0;
		public void next() {
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}
		public void previous() {
			if(currentIndex>0) {
				currentIndex--;
			}
		}
		public void setChannel(int i) {
			currentIndex=i;
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

}
