package prac8;
import java.awt.*;
import java.awt.event.*;

public class prac8_3 extends Frame implements ActionListener {
	Label lbl_info;
	Choice cho;
	public prac8_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		lbl_info = new Label("버튼을 눌러 주세요.");
		String labelName=lbl_info.getName();//레이블 명칭의 획득
		
		
		add(lbl_info);
		cho= new Choice();
		
		cho.add("1");cho.add("2");cho.add("3");cho.add("4");
		add(cho);
		
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	
	}

	public static void main(String[] args) {
		prac8_3 f = new prac8_3("prac8_3 예제");
	}
}