package com.qjm.Adapter;

public class MediaAdapter implements MediaPlayer{
	AdvanceMediaPlayer advance;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advance=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("MP4")) {
			advance=new MP4Player();
		}
	}
	@Override
	public void play(String audioPlayer,String fileName) {
		// TODO 自动生成的方法存根
		if(audioPlayer.equalsIgnoreCase("Vlc")) {
			advance.playVlc(fileName);
		}else if(audioPlayer.equals("mp4")) {
			advance.playMP4(fileName);
		}
	}

}
