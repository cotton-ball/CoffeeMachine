package Money;

public class Money{
    public static int coin100;
    public static int coin500;
    public static int note1000;
    public static int sum;

    public Money(int coin100, int coin500, int note1000) {
        this.coin100 = coin100;
        this.coin500 = coin500;
        this.note1000 = note1000;
        this.sum =(this.coin100*100)+(this.coin500*500)+(this.note1000);
    }

    public void increaseNote1000(){this.note1000 += 1;}
    public void increaseCoin100(){this.coin100 += 1;}
    public void increaseCoin500(){this.coin500 += 1;}


    public void setCoin100(int coin100) { this.coin100 = coin100;}
    public void setCoin500(int coin500) { this.coin500 = coin500;}
    public void setNote1000(int note1000) {this.note1000 = note1000;}
    public void setSum() {this.sum = (this.coin100*100)+(this.coin500*500)+(this.note1000*1000);}

    public int getSum() { return sum=(this.coin100*100)+(this.coin500*500)+(this.note1000*1000); }
    public int getCoin100() { return coin100;}
    public int getCoin500() {return coin500;}
    public int getNote1000() {return note1000;}
}