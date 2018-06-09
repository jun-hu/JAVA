package prac8;
import java.awt.*;

public class FileDialogExam {
	public static void main(String[ ] args) {
		Frame f = new Frame( );
		FileDialog d = new FileDialog(f, "파일 다이얼로그 예제");
		d.setSize(200, 200);
		d.setVisible(true);
		}
}
