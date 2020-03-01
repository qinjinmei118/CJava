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
		System.out.println("��Ƶ���ʹ����ɹ�");
	}
	public void display() {
		System.out.println("��Ƶ���ͣ�"+audioType+"\t��Ƶ���ļ�����"+filename+"\t·����"+router);
	}
	public Object clone() throws CloneNotSupportedException{
		System.out.println("��Ƶ�����ɹ�");
		return (ClonePlayer)super.clone();
	}
}
