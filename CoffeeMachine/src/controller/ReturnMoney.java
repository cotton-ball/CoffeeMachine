package controller;

import Money.MoneyManager;
import UserPanel.UserPanelLeft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static UserPanel.UserPanelRight.stateLCD;

import static Money.MoneyManager.userInputMoney;

public class ReturnMoney implements ActionListener {
    JTextArea returnChange;
    JTextField changeLCD;



    public ReturnMoney(JTextArea returnChange, JTextField changeLCD) {
        this.returnChange = returnChange;
        this.changeLCD = changeLCD;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stateLCD.setText("잔돈이 반환되었으니 찾아가세요.");
        JButton cb=(JButton) e.getSource();
        int coin100,coin500,note1000;
        coin100= userInputMoney.getCoin100();
        coin500= userInputMoney.getCoin500();
        note1000 = userInputMoney.getNote1000();
        returnChange.setText("100원 : "+coin100+"개\n500원 : "+coin500+"개\n1000원 지폐 "+note1000+"개 \n총액 : "+userInputMoney.getSum()+"원");
        changeLCD.setText("0");
       MoneyManager.returnChangeFromStack();

       //커피 LCD 에 불 꺼짐
        for(int i = 0; i< UserPanelLeft.coffeeLCDbtn.length; i++){
            UserPanelLeft.coffeeLCDbtn[i].setText(" ");
        }



    }
}
