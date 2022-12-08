package spring.demo.ioc;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Ioc-ApplicationContext.xml");



        CricketCoach coach = context.getBean("cricketcoach",CricketCoach.class);


        System.out.println(coach.getRandomFortunes());


    }
}
