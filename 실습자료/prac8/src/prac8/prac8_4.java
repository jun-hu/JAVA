package prac8;
import java.awt.*;
import java.awt.event.*;

public class prac8_4 extends Frame  implements ItemListener{
	 Checkbox c1,c2,c3;
	 Checkbox c4,c5,c6;
	 CheckboxGroup gr,gr2;
	public prac8_4() {
		super(" :: checkbox :: ");
		setLayout(new FlowLayout());
		gr = new CheckboxGroup();
		c1 = new Checkbox("����",gr,false);
		c2 = new Checkbox("��ȭ����",gr,true);
		c3 = new Checkbox("����",gr,false);
		add(new Label("��  �� : "));
		add(c1);
		add(c2);
		add(c3);

		gr2 = new CheckboxGroup();
		
		c4 = new Checkbox("��",gr2,true);
		c5 = new Checkbox("����",gr2,false);
		c6 = new Checkbox("�ｺ",gr2,false);
		add(new Label("��  �� 2: "));
		add(c4);
		add(c5);
		add(c6);

	
		
		//c1.addItemListener(this);
		//c2.addItemListener(this);
		//c3.addItemListener(this);
		//c4.addItemListener(this);
		//c5.addItemListener(this);
		//c6.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac8_4 cb = new prac8_4();
		  cb.setSize(250, 400);
		  cb.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)  // 3.
	 {}

}
  // 1.

/*public class CheckBoxTest extends Frame  implements ItemListener // 2.
{

 Canvas can; // ��ȭ�� ��Ȱ ����..
 TextField t;
 static String str ="";

 public CheckBoxTest()
 {
  super(" :: checkbox :: ");
  setLayout(new FlowLayout());

  c1 = new Checkbox("����");
  c2 = new Checkbox("��ȭ����");
  c3 = new Checkbox("����");

  add(new Label("��  �� : "));
  add(c1);
  add(c2);
  add(c3);

  gr = new CheckboxGroup();

  c4 = new Checkbox("Red", true, gr);;
  c5 = new Checkbox("Blue", false, gr);

  add(new Label("��ȭ�� ����:"));
  add(c4);
  add(c5);

   can = new Canvas();
   //�ݵ�� SIze��� �Ѵ�..
   can.setSize(100,100);
   // ĵ������ ������ ���� ������ �⺻�� �⺻ ������ ����..
   can.setBackground(Color.gray);
   add(can);
  
   // 4.  listener ����
   c1.addItemListener(this);
   c2.addItemListener(this);
   c3.addItemListener(this);
   c4.addItemListener(this);
   c5.addItemListener(this);
 } // ������------------------------------------

 public void itemStateChanged(ItemEvent e)  // 3.
 {
  Object obj = e.getSource();   // �߻��� �̺�Ʈ ��ü
  // Object obj1[];
  int res =0;
   
  res = e.getStateChange();
  
  if (res == 1)  // 1== ItemEvent.SELECTED
  {
   str += (String)(e.getItem());
   setTitle("üũ ��"+str);  

  }else if( res == 2)
  {
   str =" ";
   setTitle(str);
  }

  if( obj == c4)
  {
   can.setBackground(Color.red);
  }
  else if( obj == c5)
  {
   can.setBackground(Color.blue);
  }
 }
 
 public static void main(String[] args) 
 {
  CheckBoxTest cb = new CheckBoxTest();
  cb.setSize(250, 400);
  cb.setVisible(true);
 } // main -------------------------------------
} //////////////////////////////////////////////////////*/



