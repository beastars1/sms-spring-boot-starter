# sms-spring-boot-starter
customize spring boot starter

1. mvn clean install
2. import in pom.xml
    ```xml
   <dependency>
        <groupId>io.github.beastars1</groupId>
        <artifactId>sms-spring-boot-starter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
   </dependency>
   ```
3. use
    ```java
    SmsSender aliyunSender = context.getBean("aliyunSender", SmsSender.class);
    SmsSender tencentSender = context.getBean("tencentSender", SmsSender.class);
    aliyunSender.send("xxx");
    tencentSender.send("xxx");
    ```