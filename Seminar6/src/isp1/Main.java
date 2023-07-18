package Seminar6.src.isp1;

import Seminar6.src.isp1.pay.impl.InternetPaymentService;


public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        iSeminar6.src.sp1.pay.impl.TerminalPaymentService terminalService = new iSeminar6.src.sp1.pay.impl.TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
        terminalService.payPhoneNumber(10);
    }
}
