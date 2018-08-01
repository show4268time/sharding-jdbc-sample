package com.showtime.jdbc.main;

import com.showtime.jdbc.fixtrue.service.DemoService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 分库分表测试
 * @author: yaoweihao
 * @date: 2018/8/1
 * @time: 9:39
 * @modified by:
 */
public class Launcher {
    public static void main(final String[] args) {
        try (ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("/sharding/shardingDatabasesTables.xml")) {
            DemoService demoService = applicationContext.getBean(DemoService.class);
            demoService.demo();
        }
    }
}
