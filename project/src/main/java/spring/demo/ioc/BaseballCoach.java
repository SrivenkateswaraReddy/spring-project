package spring.demo.ioc;


public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Pratice batting everyday for 30 minutes";
    }
}
