package io.github.beastars1.sms;

public class AliyunSender implements SmsSender {
    private final SmsProperties.SmsMessage smsMessage;

    public AliyunSender(SmsProperties.SmsMessage smsMessage) {
        this.smsMessage = smsMessage;
    }

    @Override
    public boolean send(String msg) {
        System.out.println(smsMessage);
        System.out.println("Aliyun send:" + msg);
        return true;
    }
}
