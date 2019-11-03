package bits.org.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Jbutton_JText extends JPanel implements ActionListener{
	//�����ı���ǩ
	private JLabel userLabel,pwdLabel;
	//���ð�ť
	private JButton loginButton,resetButton;
	//�����ı�����
	private JTextField inputUserText;
	//������������ 
	private JPasswordField inputpwdText;
	//�������
	private JPanel panelUserName;
    private JPanel panelPassWd;
    private JPanel panelLoginButton;
	/*private JPanel panel;
*/
	public Jbutton_JText() {
		this.userLabel=new JLabel("�û���");
		this.pwdLabel=new JLabel("����");
		this.loginButton=new JButton("��¼");
		this.loginButton.addActionListener(this);
		this.resetButton=new JButton("����");
		this.resetButton.addActionListener(this);
		this.inputUserText=new JTextField(10);
		this.inputpwdText=new JPasswordField(10);
		
		/*this.panel=new JPanel();
		this.setLayout(new GridLayout());
		this.panel.add(userLabel);
		this.panel.add(pwdLabel);
		this.panel.add(inputUserText);
		this.panel.add(inputpwdText);
		this.panel.add(loginButton);
		this.panel.add(resetButton);*/
		this.panelUserName = new JPanel();
		this.panelPassWd = new JPanel();
    	this.panelLoginButton = new JPanel();
    	
    	this.setLayout(new GridLayout(3,1));
    	this.panelUserName.add(userLabel);
    	this.panelUserName.add(inputUserText);
    	
    	this.panelPassWd.add(pwdLabel);
    	this.panelPassWd.add(inputpwdText);
    	
    	this.panelLoginButton.add(loginButton);
    	this.panelLoginButton.add(resetButton);
    	
    	this.add(panelUserName);
    	this.add(panelPassWd);
    	this.add(panelLoginButton);
	}
		/*this.add(panel);
	}*/
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==loginButton) {
			if(inputUserText.getText().contains("����")&&inputpwdText.getText().contains("123")) {
				JOptionPane.showMessageDialog(null, "��¼�ɹ�");
			}
			else {
				JOptionPane.showMessageDialog(null, "��¼ʧ��");
			}
		}
		else if(event.getSource()==resetButton) {
			inputUserText.setText("");
			inputpwdText.setText("");
		}
		
	}
}
