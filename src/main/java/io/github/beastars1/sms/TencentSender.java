package io.github.beastars1.sms;

public class TencentSender implements SmsSender {
    private final SmsProperties.SmsMessage smsMessage;

    public TencentSender(SmsProperties.SmsMessage smsMessage) {
        this.smsMessage = smsMessage;
    }

    @Override
    public boolean send(String msg) {
        System.out.println(smsMessage);
        System.out.println("Tencent send:" + msg);
        return true;
    }
}
