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
		JFrame jFrame = new JFrame("üũ�ڽ��� ����");
		Container contentPane = jFrame.getContentPane();

		contentPane.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		onion = new JCheckBox("����");
		jPanel.add(onion);
		chese = new JCheckBox("ġ��");
		jPanel.add(chese);
		tomato = new JCheckBox("�丶��");
		jPanel.add(tomato);
		
		
		JRadioButton  rb1 = new JRadioButton("����");  // JRadioButton ����
		JRadioButton  rb2 = new JRadioButton("����");
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
