package prac8;

import java.awt.*;
import java.awt.event.*;

public class prac8_5 extends Frame  implements ItemListener {
	// 1.
	Checkbox c1, c2, c3;
	CheckboxGroup gr;
	Choice cho;
	
	TextField t;
	static String str = "";

	public prac8_5() {
		super("���� ����");
		setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
		add(new Label("�̸� �Է�: "));
		add(new TextField("       "));
		add(new Label("��� ����"));
		
		cho= new Choice();
		cho.add("1");cho.add("2");cho.add("3");cho.add("4");
		add(cho);
		
		
		add(new Label("� ��� ����"));
		gr = new CheckboxGroup();
		c1 = new Checkbox("������",gr,false);
		c2 = new Checkbox("����",gr,false);
		c3 = new Checkbox("����",gr,false);
		add(c1);add(c2);add(c3);


	} // ������------------------------------------

	public void itemStateChanged(ItemEvent e) // 3.
	{
	}

	public static void main(String[] args) {
		prac8_5 cb = new prac8_5();
		cb.setSize(250, 400);
		cb.setVisible(true);
	}

}
