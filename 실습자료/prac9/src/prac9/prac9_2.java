package prac9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class prac9_2 extends JFrame {
	static JCheckBox onion, chese, tomato;

	public prac9_2() {
		setLayout(new FlowLayout());
		JFrame jFrame = new JFrame("체크박스와 라디오");
		Container contentPane = jFrame.getContentPane();

		contentPane.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		
		String[ ] info_data = { "대한민국", "중국", "영국","프랑스","미국","일본","독일" }; // 사용할 데이터 배열 생성
		JList list = new JList( info_data ); // 데이터를 포함한 list 생성
		jPanel.add(list);


		contentPane.add(jPanel);
	

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	
	}
	public static void main(String[] args) {
		prac9_2 prac= new prac9_2();
	}

}
