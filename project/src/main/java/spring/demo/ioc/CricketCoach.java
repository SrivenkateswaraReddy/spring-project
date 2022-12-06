package spring.demo.ioc;

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Pratice batting and fielding for the tournament";
    }
}
