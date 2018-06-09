package prac9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class prac9_3 extends JFrame {
	static JCheckBox onion, chese, tomato;

	public prac9_3() {
		setLayout(new FlowLayout());
		JFrame jFrame = new JFrame("체크박스와 라디오");
		Container contentPane = jFrame.getContentPane();

		contentPane.setLayout(new BorderLayout());
		
		String[] header = { "<html><font color = black size = 5>학번</font></html>" ,
		"<html><font color = red size = 5>국어</font></html","<html><font color = cyan size = 5>수학</font></html>" ,
		"<html><font color = blue size = 5>영어</font></html" };
		String[][] data = { {"201300912","67","90","80"},{"2013104011","80" ,"30","40"}};
		JTable jTable = new JTable(data, header);
		JScrollPane scrollPane = new JScrollPane(jTable);

		contentPane.add(scrollPane);
	

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	
	}
	public static void main(String[] args) {
		prac9_3 prac= new prac9_3();
	}

}
