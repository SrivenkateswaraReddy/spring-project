package spring.demo.ioc;

public class TrackCoach  implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Pratice 5k run for the event schedule ";
    }
}
