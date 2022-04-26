package io.github.beastars1.sms;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sms")
@Data
public class SmsProperties {
    /**
     * 腾讯
     */
    private SmsMessage tencent = new SmsMessage();
    /**
     * 阿里
     */
    private SmsMessage aliyun = new SmsMessage();

    @Data
    @ToString
    public static class SmsMessage {
        /**
         * 用户名
         */
        private String user;
        /**
         * 密码
         */
        private String pwd;
        /**
         * 密钥
         */
        private String sign;
        // 链接
        private String url;
    }
}
