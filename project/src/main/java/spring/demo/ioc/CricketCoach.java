package spring.demo.ioc;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice batting and fielding for the tournament";
    }

    @Override
    public String getDailyFortune() {
        return "dependency-injection from CricketCoach "+ fortuneService.getFortuneService();
    }
}
