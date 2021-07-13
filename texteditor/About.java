package texteditor;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	JButton b1;
	About(){
		setBounds(600,200,700,600);
		setTitle("About the Editor");
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("texteditor/icons/windows.png"));
		Image i2=i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(150,40,400,80);
		add(l1);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("texteditor/icons/notepad.png"));
		Image i5=i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l2=new JLabel(i6);
		l2.setBounds(50,180,70,70);
		add(l2);
		
		JLabel l3=new JLabel("<html>Rahul Raj Codes<br>My own version 2021<br>Rahul Raj Codes, All Right Reserverd<br><br>Text editor is a word processing program<br>which allows changingof text in a computer file,<br>TextEditor for basic text editing program<br>which enable computer user to create documents</html>");
		l3.setBounds(150,130,500,300);
		add(l3);
		l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		
		b1=new JButton("OK");
		b1.setBounds(580,500,80,25);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}
	public static void main(String[] args) {
		new About().setVisible(true);
	}
}
