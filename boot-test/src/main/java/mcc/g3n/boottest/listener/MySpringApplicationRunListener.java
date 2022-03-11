package mcc.g3n.boottest.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.env.ConfigurableEnvironment;

public class MySpringApplicationRunListener implements SpringApplicationRunListener, PriorityOrdered {
    // 必须有这个签名的构造方法，否则会报错
    public MySpringApplicationRunListener(SpringApplication application, String[] args) {
        System.out.println("MySpringApplicationRunListener 构造方法执行");
    }
    @Override
    public void starting() {
        System.out.println("MySpringApplicationRunListener starting方法执行");
    }
    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("MySpringApplicationRunListener environmentPrepared方法执行");
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener contextPrepared方法执行");
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener contextLoaded方法执行");
    }
    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener started方法执行");
    }
    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("MySpringApplicationRunListener running方法执行");
    }
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("MySpringApplicationRunListener failed方法执行");

    }
    @Override
    public int getOrder() {
        return 0;
    }
}
