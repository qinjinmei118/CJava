package allShapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public abstract class AShapes {
	public int x,y;
	public int borderType;
	public int borderWidth;
	public Color borderColor;
	public int fillType;
	public Color fillColor;
	public Graphics g;//画笔
	MouseEvent e;
	public abstract void draw(Graphics g);//画出图形
	public abstract void IsMatched(MouseEvent e);//判断是否在图形内
}
