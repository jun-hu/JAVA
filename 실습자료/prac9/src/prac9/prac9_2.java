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
		JFrame jFrame = new JFrame("üũ�ڽ��� ����");
		Container contentPane = jFrame.getContentPane();

		contentPane.setLayout(new BorderLayout());

		JPanel jPanel = new JPanel();
		
		String[ ] info_data = { "���ѹα�", "�߱�", "����","������","�̱�","�Ϻ�","����" }; // ����� ������ �迭 ����
		JList list = new JList( info_data ); // �����͸� ������ list ����
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
