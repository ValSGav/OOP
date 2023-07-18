package Seminar6.src.isp1.pay;

public interface Payable {
    void payWebMoney(int amount);

    void payCreditCard(int amount);

    void payPhoneNumber(int amount);
}
