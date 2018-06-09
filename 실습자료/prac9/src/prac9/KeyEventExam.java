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
		System.out.println(e.getKeyChar() + "키 버튼이 내려갔습니다.");
	}

	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "키 버튼이 올라왔습니다.");
	}

	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "키 버튼");
	}

	public static void main(String[] args) {
		new KeyEventExam("키 이벤트 예제");
	}
}