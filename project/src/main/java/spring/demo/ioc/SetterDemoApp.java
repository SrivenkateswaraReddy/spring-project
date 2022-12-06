package spring.demo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Ioc-ApplicationContext.xml");


        TennisCoach theCoach = context.getBean("tenniscoach",TennisCoach.class);


        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getPlayerName());
        System.out.println(theCoach.getNoOfGrandSlams());

        context.close();
    }
}
