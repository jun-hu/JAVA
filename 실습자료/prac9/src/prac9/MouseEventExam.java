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
		System.out.println("마우스 버튼을 클릭함");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 버튼을 누름");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 버튼을 놓음");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 윈도우 안에 들어옴");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 윈도우 밖으로 나감");
	}

	public static void main(String[] args) {
		new MouseEventExam("마우스 이벤트 예제");
	}
}