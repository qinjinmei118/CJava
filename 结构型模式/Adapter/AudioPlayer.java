package com.qjm.Adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioPlayer,String fileName) {
		// TODO 自动生成的方法存根
		if(audioPlayer.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 finename:"+fileName);
		}else if(audioPlayer.equalsIgnoreCase("MP4")||audioPlayer.equalsIgnoreCase("vlc")) {
			mediaAdapter=new MediaAdapter(audioPlayer);
			mediaAdapter.play(audioPlayer, fileName);
		}else {
			System.out.println("Playing Invalide media:"+audioPlayer+"format not supported");
		}
	}

}
