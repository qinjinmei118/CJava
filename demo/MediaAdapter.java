package com.qjm.demo;

public class MediaAdapter implements MediaPlayer{

	@Override
	public ClonePlayer play(String audioType, String filename) {
		// TODO 自动生成的方法存根
		
		if(audioType.equalsIgnoreCase("vlc")) {
		ClonePlayer col=new ClvPlayer(audioType, filename);
		return col;
		}
		else if(audioType.equals("mp4")){
		ClonePlayer col=new Mp4Player(audioType, filename);
		return col;
		}
		return null;
	}

}
