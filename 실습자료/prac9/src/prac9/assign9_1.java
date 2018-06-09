package prac9;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class assign9_1 extends JFrame{

    private JLabel Regi_lab = new JLabel("Register");
    
    private JLabel id_lab = new JLabel("ID :");
    private JTextField id_field = new JTextField(10);
    private JLabel pw_lab = new JLabel("PW :");
    private JPasswordField pw_field = new JPasswordField(10);
    private JLabel rep_lab = new JLabel("Repeat :");
    private JPasswordField rep_field = new JPasswordField(10);

    private JLabel gender_lab = new JLabel("GENDER :");
    private JRadioButton item1 = new JRadioButton("MALE");
    private JRadioButton item2 = new JRadioButton("FEMALE");

    private ButtonGroup gender_select = new ButtonGroup();

    private JButton btn1 = new JButton("Register");

    private JLabel state = new JLabel("Not confirm");
    private JLabel label_id = new JLabel("");
    private JLabel label_gender = new JLabel("");
    private JLabel show_id = new JLabel("");
    private JLabel show_gender = new JLabel("");

    public assign9_1(String title){
        super(title);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(10,1));

        JPanel pan1 = new JPanel(); //panel1 : ����
        pan1.add(Regi_lab);

        JPanel pan2 = new JPanel(); //panel2 : ���̵� �Է�
        pan2.add(id_lab);
        pan2.add(id_field);
        
        id_field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            	show_id.setText(id_field.getText()); //���̵� �����ش�.
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //do nothing
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //do nothing
            }
        });

        JPanel pan3 = new JPanel(); //panel3 : �н�����
        pan3.add(pw_lab);
        pan3.add(pw_field);

        JPanel pan4 = new JPanel(); //panel4 : �н����� üũ
        pan4.add(rep_lab);
        pan4.add(rep_field);

        JPanel pan5 = new JPanel(); //panel5 : ���� ����
        pan5.add(gender_lab);
        gender_select.add(item1); //��ư�׷쿡 �߰���Ų ��
        gender_select.add(item2);
        pan5.add(item1); //���ε��� panel�� �߰����Ѿ� �Ѵ�.
        pan5.add(item2);

        item1.addItemListener(new ItemListener() { //���� ���ý�
            public void itemStateChanged(ItemEvent e) {
                show_gender.setText("MALE");
            }
        });

        item2.addItemListener(new ItemListener() { //���� ���ý�
            public void itemStateChanged(ItemEvent e) {
            	show_gender.setText("FEMALE");
            }
        });

        JPanel pan6 = new JPanel(); //panel6 : Register��ư
        pan6.add(btn1);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if(((JButton)obj) == btn1){
                    if(rep_field.getPassword().length == pw_field.getPassword().length) {
                        boolean right_pw = true;
                        for(int i=0; i<rep_field.getPassword().length;i++)
                            if(rep_field.getPassword()[i] != pw_field.getPassword()[i])
                                right_pw = false;

                        if(right_pw) { //������ ���� ������ ������ش�.
                            state.setText("CONFIRMED");
                            label_id.setText(show_id.getText());
                            label_gender.setText(show_gender.getText());
                        }else{
                            JOptionPane.showMessageDialog(rep_field,
                                    "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            state.setText("FAILED");
                        }

                    }
                    else {
                        JOptionPane.showMessageDialog(rep_field,
                                "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        state.setText("FAILED");
                    }
                }
            }
        });

        JPanel pan7 = new JPanel(); //panel7 : ���� ��
        pan7.add(state);

        JPanel pan8 = new JPanel(); //panel8 : ���̵� Ȯ��
        pan8.add(label_id);

        JPanel pan10 = new JPanel(); //panel9 :  ��й�ȣ Ȯ��
        pan10.add(label_gender);

        contentPane.add(pan1);
        contentPane.add(pan2);
        contentPane.add(pan3);
        contentPane.add(pan4);
        contentPane.add(pan5);
        contentPane.add(pan6);
        contentPane.add(pan7);
        contentPane.add(pan8);
        contentPane.add(pan10);

        //pack();
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] agrs){
        new assign9_1("Register");
    }
}

