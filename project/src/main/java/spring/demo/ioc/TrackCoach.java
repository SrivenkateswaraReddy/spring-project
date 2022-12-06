package spring.demo.ioc;

public class TrackCoach  implements Coach{

    private  FortuneService fortuneService;

    public TrackCoach(){}
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice 5k run for the event schedule ";
    }

    @Override
    public String getDailyFortune() {
        return "dependency injecton  from  TrackCoach "+ fortuneService.getFortuneService() ;
    }
}
