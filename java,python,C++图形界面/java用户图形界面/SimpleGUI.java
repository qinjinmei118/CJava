package bits.org.GUI;

import javax.swing.JFrame;

public class SimpleGUI extends JFrame{
	public SimpleGUI(Jbutton_JText btnText) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("javaºÚµ•ΩÁ√Ê");
		this.setSize(200, 200);
		this.setLocation(600, 200);
		this.setVisible(true);
		this.add(btnText);
	}
	public static void main(String[] args) {
		Jbutton_JText tt=new Jbutton_JText();
		SimpleGUI ss=new SimpleGUI(tt);
	}
}
