package spring.demo.ioc;


public class BaseballCoach implements Coach {


    // defining constructor for dependency injection
    private  FortuneService fortuneService;

    //defining the constructor
    public BaseballCoach() {
    }
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice batting everyday for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
