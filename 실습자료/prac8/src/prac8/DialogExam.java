package prac8;
import java.awt.*;

public class DialogExam {

	
	public static void main(String[ ] args) {
		Frame f = new Frame( );
		Dialog d = new Dialog(f, "다이얼로그 예제");
		d.setSize(200, 200);
		d.setVisible(true);
	}

}
