package controller;

import Coffee.SampleCoffeeArray;
import UserPanel.UserPanelLeft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Money.MoneyManager.userInputMoney;
import static UserPanel.UserPanelRight.changeLCD;
import static UserPanel.UserPanelRight.stateLCD;

//돈을 유저 패널에서 입력 받아 컨트롤러가 머니매니져를 사용해 카운트 한 뒤 유저패널의 잔돈 LCD 에 출력

public class PutMoney implements ActionListener { ;
    String moneyStr;


    public PutMoney(String moneyStr) {
        if(moneyStr.equals("Note Slot")||moneyStr.equals("Coin Slot"))
            { this.moneyStr = "0";}
        else {this.moneyStr = moneyStr;}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb=(JComboBox<String>)e.getSource();
        moneyStr =cb.getSelectedItem().toString();

        if(moneyStr.equals("1000")) userInputMoney.increaseNote1000();
        else if(moneyStr.equals("500")) userInputMoney.increaseCoin500();
        else if (moneyStr.equals("100")) userInputMoney.increaseCoin100();
        userInputMoney.getSum();

       changeLCD.setText(userInputMoney.getSum()+"");

       //커피 LCD 에 불 켜짐
        for(int i = 0; i<SampleCoffeeArray.sampleCoffee.size(); i++){
            if(DataManager.moneyCheck(SampleCoffeeArray.sampleCoffee.get(i).getPrice())) {
                if(DataManager.waterCheck(SampleCoffeeArray.sampleCoffee.get(i).getWater())){
                    if(DataManager.ingredientCheck(SampleCoffeeArray.sampleCoffee.get(i).getSugar(), SampleCoffeeArray.sampleCoffee.get(i).getCream(),SampleCoffeeArray.sampleCoffee.get(i).getCoffeeMix())){
                        if(DataManager.changeStackCheck()){
                            UserPanelLeft.coffeeLCDbtn[i].setText("●");
                            stateLCD.setText("불이 들어온 커피만 선택 가능 합니다.");
                        } else {
                            stateLCD.setText("죄송합니다. 현재 잔돈이 부족합니다.");
                        }
                    }else {
                        stateLCD.setText("죄송합니다. 재료가 다 떨어졌습니다..");
                    }

                }else {stateLCD.setText("죄송합니다. 물이 다 떨어졌습니다.");}

            }
        }






    }
}
