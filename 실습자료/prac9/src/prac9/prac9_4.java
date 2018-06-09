package prac9;


import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class prac9_4 extends JPanel implements KeyListener, ActionListener {
	JLabel lbl_info;
	JButton btn1, btn2,btn3,btn4;
	JCheckBox c1, c2, c3;
	ButtonGroup buttonGroup1; 
	JComboBox cho;TextField userText;
	
	public prac9_4(String str) {
		
		
		JFrame jf=new JFrame("Login");
		jf.setSize(500, 500);
		jf.setLocation(700, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
		lbl_info = new JLabel("��ư�� ���� �ּ���.");
		jf.add("North", lbl_info);
		
		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
		
		jp.add(new Label("��� ����"));
		
		cho= new JComboBox();
		cho.addKeyListener(this);
		cho.addItem("1");cho.addItem("2");cho.addItem("3");cho.addItem("4");
		jp.add(cho);
		
		btn3 = new JButton("���ں���");
		btn3.addActionListener(this);
		
		jp.add(btn3);
		jf.add("Center",jp);
	
		
		jp.add("Center",new Label("� ��� ����"));
		buttonGroup1= new ButtonGroup();
		c1 = new JCheckBox("������",false);
		c2 = new JCheckBox("����",false);
		c3 = new JCheckBox("����",false);
		buttonGroup1.add(c1);buttonGroup1.add(c2);buttonGroup1.add(c3);
		jp.add("Center",c1);jp.add("Center",c2);jp.add("Center",c3);
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("������");
			}
		});
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("����");
			}
		});
		c3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("����");
			}
		});
		
		
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if ((JButton) obj == btn1) {
			System.exit(0);
		} else if ((JButton) obj == btn2){
			String name=userText.getText();
			lbl_info.setText(name);
		} else if((JButton)obj==btn3) {
			String num= (String) cho.getItemAt(cho.getSelectedIndex());
			lbl_info.setText(num);
		} else if((JButton)obj==btn4) {
			
		}
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� ���������ϴ�.");
		if(e.getKeyChar()=='x'  ||e.getKeyChar()=='X')  System.exit(0);
	}

	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� �ö�Խ��ϴ�.");
	}

	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư");
	}
	
	public static void main(String[] args) {
		new prac9_4("Ű �̺�Ʈ ����");
	}

	
}