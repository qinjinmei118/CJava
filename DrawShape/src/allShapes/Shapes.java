package allShapes;

import javax.swing.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Shapes 
{
	public static void main(String[] args) 
	{
		System.out.print("所有图形的输出！！！");
          new ShapesFrame();
	}
	//设置窗体
	public static class ShapesFrame extends JFrame 
	{
	        public ShapesFrame() 
	        {
	        	//设置窗体
	            setTitle("Shapes绘画");
	            setSize(800, 800);
	            setVisible(true);
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            shapesPanel panel = new shapesPanel();
	            setContentPane(panel);//给窗体添加画板
	          
	        }

	    }
	//设置画板
	  public static class shapesPanel extends JPanel 
	  {
	        public void paint(Graphics g) 
	        {
	        	
	        	Square s=new Square(20,40,80,80);
	        	s.draw(g);
	        	Rectangle r=new Rectangle(100,500,130,170);
        		r.draw(g);
        		
        		 Circle c=new Circle(500,300,50);
 	        	c.draw(g);
 	        	Eclipse ee=new Eclipse(400,400,300,200);
        		ee.draw(g);
        		int xPoints[]= {200,300,150,200};
        		int yPoints[]= {250,300,150,250};
        		Triangle tt=new Triangle(xPoints,yPoints,4);
        		tt.draw(g);
	        	Text str=new Text("java高级程序设计",400,400);
	        	str.draw(g);
	        }
}
}
class Square extends AShapes
{

	public int x,y;
	public int w,h;
	public Square(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	public void draw(Graphics g)
	{
		
		g.setColor(Color.red); 
		g.drawRect(x,y,w,h);
		g.setColor(Color.lightGray);
		g.fillRect(x, y, w, h);
	}
	
	public void IsMatched(MouseEvent e) {
		// TODO 自动生成的方法存根
		int OrgX=e.getX();
		int OrgY=e.getY();
		if (( OrgX>=x - w / 2) && ( OrgX<=x + w / 2) && ( OrgY>=y - w / 2) && ( OrgY<=y + w / 2))
		{
			System.out.print("你所点的位置属于图形内");
		}
		else
		{
			System.out.print("你所点的位置不属于图形内");
		}
	}

}
class Rectangle extends AShapes
{
	public int x,y;
	public int w,h;
	public Rectangle(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.green); 
		g.drawRect(x,y,w,h);
		g.setColor(Color.PINK);
		g.fillRect(x, y, w, h);
	}


	public void IsMatched(MouseEvent e) {
		
		int OrgX=e.getX();
		int OrgY=e.getY();
		if (( OrgX>=x - w / 2) && ( OrgX<=x + w / 2) && ( OrgY>=y - h / 2) && ( OrgY<=y + h / 2))
		{
			System.out.print("你所点的位置属于图形内");
		}
		else
		{
			System.out.print("你所点的位置不属于图形内");
		}
	}


}
class Circle extends AShapes
{
	private int r;
	private int x,y;
	public Circle(int x,int y,int r)
	{
		this.r=r;
		this.x=x;
		this.y=y;
	}
	public void draw(Graphics g)
	{
		g.setColor(Color.blue); 
		g.drawOval(x, y, r, r);
		g.setColor(Color.darkGray);
		g.fillOval(x, y, r, r);
	}
	
	//判断鼠标点击是否在图形内
	public void IsMatched(MouseEvent e) {
		int OrgX=e.getX();
		int OrgY=e.getY();
		double c = r / 2;
		double a =OrgX-x;
		double b = OrgY-y;
		if (((a*a) / (c*c) + (b*b) / (c*c)) <= 1)
		{
			System.out.print("你所点的位置属于图形内");
		}
		else
		{
			System.out.print("你所点的位置不属于图形内");
		}
	}
	
}
class Eclipse extends AShapes
{
	private int width;
	private int height;
	private int X;
	private int Y;
	public Eclipse(int x,int y,int w,int h)
	{
		X=x;
		Y=y;
		width=w;
		height=h;
	}
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(X, Y, width, height);
		g.setColor(Color.green);
		g.fillOval(X, Y, width, height);
	}
	
	public void IsMatched(MouseEvent e) {
		int OrgX=e.getX();
		int OrgY=e.getY();
		double c = width / 2; double d = height / 2;
		double a = OrgX-x;
		double b =  OrgY-y;
		if (((a*a) / (c*c)+ (b*b) /( d*d) )<= 1)
		{
			System.out.print("你所点的位置属于图形内");
		}
		else
		{
			System.out.print("你所点的位置不属于图形内");
		}
	}
	
	
}
class Triangle extends AShapes
{
	private int width;
	private int xPoints[];
	private int yPoints[];
	private int nPoints;
	public Triangle(int xPoints[],int yPoints[],int nPoints)
	{
	/*	this.x=x;
		this.y=y;*/
		this.xPoints=xPoints;
		this.yPoints=yPoints;
		this.nPoints=nPoints;
	}
	public void draw(Graphics g) {
		g.setColor(Color.darkGray);
    	g.fillPolygon(xPoints, yPoints, nPoints);
		g.drawPolygon(xPoints, yPoints, nPoints);
	}
	
	public void IsMatched(MouseEvent e) {
		int OrgX=e.getX();
		int OrgY=e.getY();
		double a, b;
		a = OrgX-x;
		b = OrgY-y;
		if ((b <= OrgY) && (width >= 2 * a - b) && (width >= -2*a - b))
		{
			System.out.print("你所点的位置属于图形内");
		}
		else
		{
			System.out.print("你所点的位置不属于图形内");
		}
	}
	
	
}
class Text extends AShapes
{
	private int height;
	private int angle;
	private int x;
	private int y;
	private String text;
	public Text(String text,int x,int y)
	{
		this.x=x;
		this.y=y;
		this.text=text;
	}
	public void draw(Graphics g) {
		g.setFont(new Font("隶书",Font.BOLD+Font.ITALIC,40));
		g.setColor(Color.DARK_GRAY);
		g.drawString(text, x, y);
		
	}

	public void IsMatched(MouseEvent e) {
		int OrgX=e.getX();
		int OrgY=e.getY();
		int b = text.length();
		if (( OrgX>=x) && ( OrgX<=x + height *Math.sin(angle / 180 * 3.14)*1.0 + b * 2 * height*2.0 / 3 * Math.cos(angle / 180 * 3.14))
				&& ( OrgY>=y - b * 2 * height*2.0 / 3 * Math.sin(angle / 180 * 3.14))
				&& (OrgY<=y + height * Math.cos(angle / 180 * 3.14)*1.0))
		{
			
		}
		
	}
	
}

