package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.CoffeeCoach;

public class springApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from Spring container
        CoffeeCoach theCoach = context.getBean("myCoach", CoffeeCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getInventoryLevel());

        // call getters for literal values
        System.out.println(theCoach.getEmailAddress());

        context.close();
    }
}
