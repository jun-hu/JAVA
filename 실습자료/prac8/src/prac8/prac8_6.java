package prac8;

import java.awt.*;
import java.awt.event.*;

public class prac8_6 extends Frame implements ActionListener {
	Label lbl_info;
	Button btn1, btn2;

	public prac8_6(String str) {
		super(str);
		lbl_info = new Label("버튼을 눌러 주세요.");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		add("Center", panel);
		add("South", lbl_info);
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if ((Button) obj == btn1) {
			lbl_info.setText("왼쪽 버튼을 눌렀습니다.");
		} else {
			lbl_info.setText("오른쪽 버튼을 눌렀습니다.");
		}
	}

	public static void main(String[] args) {
		new prac8_6("ActionEvent 예제");
	}
}