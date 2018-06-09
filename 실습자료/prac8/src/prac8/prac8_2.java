package prac8;
import java.awt.*;

public class prac8_2 extends Frame{
	  Button b1, b2;
	  
	  public prac8_2() {
		  setLayout(new FlowLayout());
		  b1 = new Button();
	      b1.setLabel("Button1");
	      b2 = new Button();
	      b2.setLabel("Button2");
	      Label l = new Label("성명");
	      String labelName=l.getName();
	      Label l2= new Label("나이");
	      
	      this.setSize(300,300);
	      this.setVisible(true);
	      add(l);
	      add(b1);
	      add(l2);
	      add(b2);

	  }
	  public static void main(String args[]) {
		  prac8_2 f = new prac8_2();

	   }



	
}
