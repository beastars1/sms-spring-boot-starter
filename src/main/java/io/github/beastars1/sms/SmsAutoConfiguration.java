package io.github.beastars1.sms;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({SmsProperties.class})
public class SmsAutoConfiguration {
    @Bean
    public SmsSender aliyunSender(SmsProperties smsProperties) {
        return new AliyunSender(smsProperties.getAliyun());
    }

    @Bean
    public SmsSender tencentSender(SmsProperties smsProperties) {
        return new TencentSender(smsProperties.getTencent());
    }
}
