package mcc.g3n.boottest.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("MyApplicationListener监听到了: " + event.getClass().getSimpleName());
    }
}
