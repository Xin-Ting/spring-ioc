package org.example;

import org.example.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        String configLocation = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        //获取Bean对象
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
