package spring.demo.ioc;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private RandomFortuneService randomFortuneService;

    public CricketCoach() {
    }

    public CricketCoach(RandomFortuneService randomFortuneService) {
        this.randomFortuneService = randomFortuneService;
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

    public String getRandomFortunes() {
        return "getting from happyFortuneService "+ randomFortuneService.getFortuneService() ;
    }
}
