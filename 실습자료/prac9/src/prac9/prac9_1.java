package prac9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class prac9_1 extends Frame {
	static JCheckBox onion, chese, tomato;

	public prac9_1() {
		setLayout(new FlowLayout());
		JFrame jFrame = new JFrame("체크박스와 라디오");
		Container contentPane = jFrame.getContentPane();

		contentPane.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		onion = new JCheckBox("양파");
		jPanel.add(onion);
		chese = new JCheckBox("치즈");
		jPanel.add(chese);
		tomato = new JCheckBox("토마토");
		jPanel.add(tomato);
		
		
		JRadioButton  rb1 = new JRadioButton("남자");  // JRadioButton 생성
		JRadioButton  rb2 = new JRadioButton("여자");
		jPanel.add(rb1);jPanel.add(rb2);


		
		

		contentPane.add(jPanel);
	

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	
	}
	public static void main(String[] args) {
		prac9_1 prac= new prac9_1();
	}

}
