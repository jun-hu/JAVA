package prac9;


import java.awt.*;
import javax.swing.*;

public class ContentPaneExam {
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Hello");
		Container contentPane = jFrame.getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		JPanel jPanel = new JPanel();
		JTextField jTextField = new JTextField(10);
		jPanel.add(jTextField);
		
		contentPane.add(jPanel);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
