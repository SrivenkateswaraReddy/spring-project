package spring.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
       // load the configuration

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Ioc-ApplicationContext.xml");

       //retrive bean from spring container

        Coach theCoach = context.getBean("trackcoach",Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // calling the dependency injection method from baseballcoach class
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
