package spring.demo.ioc;


public class MyApp {

    public static void main(String[] args) {
        //Create a coach
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();
        //use the object
        System.out.println(
                theCoach.getDailyWorkout()
        );
    }
}
