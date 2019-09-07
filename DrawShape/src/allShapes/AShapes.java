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
	public Graphics g;//����
	MouseEvent e;
	public abstract void draw(Graphics g);//����ͼ��
	public abstract void IsMatched(MouseEvent e);//�ж��Ƿ���ͼ����
}
