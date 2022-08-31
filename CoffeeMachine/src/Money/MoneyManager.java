package Money;

public class MoneyManager {
    public static Money changeStack = new Money(100,100,100); //거스름돈을 거슬러 줄 수 있는 동전의 양
    public static Money salesData = new Money(0,0,0);
    public static Money userInputMoney = new Money(0,0,0);


    public static int updateUserMoney(int selecetCoffeePrice){
        userInputMoney.sum -= selecetCoffeePrice;
        int tmp = userInputMoney.sum;
        if(tmp >= 1000){
            userInputMoney.note1000 = tmp/1000;
            tmp%=1000;
            userInputMoney.coin500 = tmp/500;
            tmp %=500;
            userInputMoney.coin100 = tmp/100;
        }
        else if(tmp>=500){
            userInputMoney.note1000 = 0;
            userInputMoney.coin500 = tmp/500;
            tmp %=500;
            userInputMoney.coin100 = tmp/100;
        }
        else { userInputMoney.coin500 =0;
            userInputMoney.coin100 = tmp/100;
        }
        return userInputMoney.getSum();

    }


    void updateSalesMoney(int selectCoffeePrice){
        salesData.sum += selectCoffeePrice;
    }

    public static void returnChangeFromStack(){
        int change = userInputMoney.getSum();
        changeStack.sum -= userInputMoney.sum;
        changeStack.coin100 -= userInputMoney.coin100;
        changeStack.coin500 -= userInputMoney.coin500;
        changeStack.note1000 -= userInputMoney.note1000;
        userInputMoney.setCoin100(0);
        userInputMoney.setCoin500(0);
        userInputMoney.setNote1000(0);
        userInputMoney.setSum();
        //return change;
    }


}
