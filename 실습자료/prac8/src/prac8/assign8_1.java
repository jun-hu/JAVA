package prac8;

import java.awt.*;
import java.awt.event.*;


public class assign8_1 extends Frame implements ActionListener {
	Label lbl_info;
	Button btn1, btn2,btn3,btn4;
	Checkbox c1, c2, c3;
	CheckboxGroup gr;
	Choice cho;TextField userText;
	
	public assign8_1(String str) {
		super(str);
		setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
		lbl_info = new Label("��ư�� ���� �ּ���.");
		add("NORTH", lbl_info);
		
		Panel panel2 = new Panel();
		add(new Label("�̸� �Է�: "));
		userText=new TextField("       ");
		btn2 = new Button("�α���");
		btn2.addActionListener(this);
		    

		add(btn2);
		add(userText);
		
		add(new Label("��� ����"));
		cho= new Choice();
		cho.add("1");cho.add("2");cho.add("3");cho.add("4");
		add(cho);
		btn3 = new Button("���ں���");
		btn3.addActionListener(this);
		add(btn3);
		    
		
		add(new Label("� ��� ����"));
		gr = new CheckboxGroup();
		c1 = new Checkbox("������",gr,false);
		c2 = new Checkbox("����",gr,false);
		c3 = new Checkbox("����",gr,false);
		add(c1);add(c2);add(c3);
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
		
		
		btn1 = new Button("����");
		btn1.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn1);
		add("SOUTH", panel);
		
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if ((Button) obj == btn1) {
			System.exit(0);
		} else if ((Button) obj == btn2){
			String name=userText.getText();
			lbl_info.setText(name);
		} else if((Button)obj==btn3) {
			String num= cho.getItem(cho.getSelectedIndex());
			lbl_info.setText(num);
		} else if((Button)obj==btn4) {
			
		}
	}

	public static void main(String[] args) {
		new assign8_1("ActionEvent ����");
	}
}