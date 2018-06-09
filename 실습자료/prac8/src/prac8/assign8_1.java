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
		lbl_info = new Label("버튼을 눌러 주세요.");
		add("NORTH", lbl_info);
		
		Panel panel2 = new Panel();
		add(new Label("이름 입력: "));
		userText=new TextField("       ");
		btn2 = new Button("로그인");
		btn2.addActionListener(this);
		    

		add(btn2);
		add(userText);
		
		add(new Label("취미 선택"));
		cho= new Choice();
		cho.add("1");cho.add("2");cho.add("3");cho.add("4");
		add(cho);
		btn3 = new Button("숫자보기");
		btn3.addActionListener(this);
		add(btn3);
		    
		
		add(new Label("운동 취미 선택"));
		gr = new CheckboxGroup();
		c1 = new Checkbox("스포츠",gr,false);
		c2 = new Checkbox("독서",gr,false);
		c3 = new Checkbox("여행",gr,false);
		add(c1);add(c2);add(c3);
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("스포츠");
			}
		});
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("독서");
			}
		});
		c3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl_info.setText("여행");
			}
		});
		
		
		btn1 = new Button("종료");
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
		new assign8_1("ActionEvent 예제");
	}
}