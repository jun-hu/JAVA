package prac9;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventExam extends Frame implements MouseListener {
	public MouseEventExam(String str) {
		super(str);
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 ��ư�� Ŭ����");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("���콺 ��ư�� ����");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺 ��ư�� ����");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺�� ������ �ȿ� ����");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("���콺�� ������ ������ ����");
	}

	public static void main(String[] args) {
		new MouseEventExam("���콺 �̺�Ʈ ����");
	}
}