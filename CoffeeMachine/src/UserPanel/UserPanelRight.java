package UserPanel;

import controller.PutMoney;
import controller.ReturnMoney;
import imagefile.Path;

import javax.swing.*;
import java.awt.*;

import static Money.MoneyManager.userInputMoney;

public class UserPanelRight extends JPanel {
    String [] coinArray = {"Coin Slot","100","500"};
    String [] noteArray = {"Note Slot","1000"};
    public static JTextField stateLCD;
    public static JTextField changeLCD;
    public static JTextArea returnChange;

    public UserPanelRight(){ //유저 우측 패널
        setPreferredSize(new Dimension(250,550));
        setBackground(new Color(200,240,150));

        //상태 메세지 패널
        JPanel stateArea = new JPanel();
        stateLCD = new JTextField("WELCOME");
        stateLCD.setBorder(BorderFactory.createEmptyBorder());
        stateLCD.setPreferredSize(new Dimension(220,80));
        stateLCD.setBackground(new Color(240,255,255));
        stateLCD.setForeground(Color.RED);
        stateLCD.setOpaque(true);
        stateArea.add(stateLCD);

        //잔돈 출력 패널
        JPanel changeArea = new JPanel();
        changeArea.setPreferredSize(new Dimension(220,50));
        changeLCD = new JTextField(userInputMoney.getSum()+"");
        changeLCD.setBorder(BorderFactory.createEmptyBorder());
        changeLCD.setPreferredSize(new Dimension(120,50));
        changeLCD.setBackground(Color.black);
        changeLCD.setForeground(Color.WHITE);
        changeLCD.setOpaque(true);
        changeLCD.setVisible(true);
        changeArea.add(changeLCD);

        //전돈 반환 레버
        JButton changeBtn  = new JButton("RETURN ");
        changeBtn.setBorder(BorderFactory.createEmptyBorder());
        changeBtn.setPreferredSize(new Dimension(70,50));
        changeBtn.setBackground(Color.red);
        changeBtn.setForeground(Color.white);
        changeBtn.setOpaque(true);
        changeArea.add(changeBtn);


        //코인,지폐 슬롯
        JPanel moneyslot = new JPanel(new GridLayout(2, 1));
        moneyslot.setPreferredSize(new Dimension(220, 220));
        JButton[] slotbtn = new JButton[2];
        JComboBox<String>[] combo = new JComboBox[2];
        combo[0] = new JComboBox(noteArray);
        combo[1] = new JComboBox(coinArray);
        for(int i = 0; i<2; i++){
            slotbtn[i] = new JButton("");
            slotbtn[i].setIcon(new ImageIcon(Path.PATH+"slot"+i+".png"));
            slotbtn[i].setContentAreaFilled(false);
            slotbtn[i].setBorder(BorderFactory.createEmptyBorder());

            moneyslot.add(slotbtn[i]);
            moneyslot.add(combo[i]);

            combo[i].addActionListener(new PutMoney( combo[i].getSelectedItem().toString()));
            slotbtn[i].addActionListener(new PutMoney( combo[i].getSelectedItem().toString()));

        }


        //잔돈 반환구
        JPanel returnArea = new JPanel();
        returnChange = new JTextArea("");
        returnChange.setBorder(BorderFactory.createEmptyBorder());
        returnChange.setPreferredSize(new Dimension(220,80));
        returnChange.setBackground(new Color(210,210,200));
        returnChange.setOpaque(true);
        returnChange.setVisible(true);
        returnArea.add(returnChange);
        returnArea.setBackground(Color.GRAY);
        changeBtn.addActionListener(new ReturnMoney(returnChange,changeLCD));


        add(stateArea,BorderLayout.NORTH);
        add(changeArea,BorderLayout.NORTH);
        add(moneyslot,BorderLayout.CENTER);
        add(returnArea,BorderLayout.SOUTH);

        moneyslot.setBackground(new Color(200,240,150));
        stateArea.setBackground(new Color(200,240,150));
        changeArea.setBackground(new Color(200,240,150));


    }


}
