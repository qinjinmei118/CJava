package com.qjm.demo;

public class ClonePlayer implements Cloneable{
	private String audioType;
	private String filename;
	private String router;
	public String getAudioType() {
		return audioType;
	}
	public void setAudioType(String audioType) {
		this.audioType = audioType;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public ClonePlayer(String audioType, String filename) {
		super();
		this.audioType = audioType;
		this.filename = filename;
		System.out.println("音频类型创建成功");
	}
	public void display() {
		System.out.println("音频类型："+audioType+"\t音频的文件名："+filename+"\t路径："+router);
	}
	public Object clone() throws CloneNotSupportedException{
		System.out.println("音频拷贝成功");
		return (ClonePlayer)super.clone();
	}
}
