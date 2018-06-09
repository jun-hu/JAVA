package prac9;


import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExam extends Frame implements KeyListener {
	public KeyEventExam(String str) {
		super(str);
		addKeyListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� ���������ϴ�.");
	}

	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� �ö�Խ��ϴ�.");
	}

	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư");
	}

	public static void main(String[] args) {
		new KeyEventExam("Ű �̺�Ʈ ����");
	}
}