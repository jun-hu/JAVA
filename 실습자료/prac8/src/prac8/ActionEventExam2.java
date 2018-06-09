package prac8;
import java.awt.*;
import java.awt.event.*;

public class ActionEventExam2 extends Frame implements ActionListener {
	Label lbl_info;
	Button btn1, btn2;
	public ActionEventExam2(String str) {
		super(str);
		lbl_info = new Label("��ư�� ���� �ּ���.");
		btn1 = new Button("�� ��ư");
		btn2 = new Button("�� ��ư");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		Panel panel = new Panel( );
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
			lbl_info.setText("���� ��ư�� �������ϴ�.");
		} else {
			lbl_info.setText("������ ��ư�� �������ϴ�.");
		}
	}

	public static void main(String[] args) {
		new ActionEventExam2("ActionEvent ����");
	}
}