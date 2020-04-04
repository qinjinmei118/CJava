package com.qjm.beiwanglu;

public class OriginatorChess {
	private MementoChess memchess;
	public OriginatorChess(MementoChess mem) {
		this.memchess=mem;
	}
	public void setX(int x) {
		memchess.setX(x);
	}
	public void setY(int y) {
		memchess.setY(y);
	}
	public MementoChess SavetoMemento() {
		return new MementoChess(memchess.getLabel(),memchess.getX(),memchess.getY());
	}
	public void Restore(MementoChess mem) {
		this.memchess.setLabel(mem.getLabel());
		this.memchess.setX(mem.getX());
		this.memchess.setY(mem.getY());
	}
	public void show() {
		System.out.println("µ±Ç°Æå×Ó×´Ì¬:"+memchess.getLabel()+"("+memchess.getX()+","+memchess.getY()+")");
	}
}
