package controller;

import Coffee.SampleCoffeeArray;
import Money.MoneyManager;
import imagefile.Path;
import manufacturer.MakeBlackCoffee;
import manufacturer.MakeNomalCoffee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Money.MoneyManager.userInputMoney;
import static UserPanel.UserPanelLeft.coffeeLCDbtn;
import static UserPanel.UserPanelLeft.returnPort;
import static UserPanel.UserPanelRight.changeLCD;
import static UserPanel.UserPanelRight.stateLCD;

public class PressCoffeeBtn implements ActionListener {
    int btnNum;
    String coffeeType;

    public PressCoffeeBtn(String type) {
        this.coffeeType = type;
        this.btnNum = (coffeeType.equals("nomal")? 0:1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(coffeeLCDbtn[btnNum].getText().equals("●")){
            //controller가 컵을 준비
            returnPort.setIcon(new ImageIcon(Path.PATH + "cuparrange.png"));
            stateLCD.setText("커피를 만드는 중 입니다... 컵 (click)");
            if(btnNum == 0){
                returnPort.addActionListener(new MakeNomalCoffee());
            }
            else if (btnNum==1){
                returnPort.addActionListener(new MakeBlackCoffee());
            }


            MoneyManager.updateUserMoney(SampleCoffeeArray.sampleCoffee.get(btnNum).getPrice()); //사용자 잔돈 업데이트

            changeLCD.setText(userInputMoney.getSum()+""); //화면에도 띄워준다
        }  else {
            stateLCD.setText("죄송합니다 돈이 부족합니다.");
        }


    }
}
