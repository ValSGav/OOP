package iSeminar6.src.sp1.pay.impl;

import Seminar6.src.isp1.pay.PayableCreditCard;
import Seminar6.src.isp1.pay.PayableWebMoney;

public class TerminalPaymentService implements PayableWebMoney, PayableCreditCard  {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

}
