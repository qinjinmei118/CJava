package com.qjm.Adapter;

public class Test {
	public static void main(String args[]) {
		AudioPlayer audio=new AudioPlayer();
		audio.play("mp3", "beyond the song.mp3");
		audio.play("mp4", "alone the song.mp4");
		audio.play("vlc", "far away from home.vlc");
	}
}
