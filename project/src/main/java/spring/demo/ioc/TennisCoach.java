package spring.demo.ioc;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    private  String playerName;
    private int noOfGrandSlams = 0;


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setNoOfGrandSlams(int noOfGrandSlams) {
        this.noOfGrandSlams = noOfGrandSlams;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNoOfGrandSlams() {
        return noOfGrandSlams;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method of the TennisCoach");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "pratice for the tennis tournament";
    }

    @Override
    public String getDailyFortune() {


        return "from Tenniscoach method :"+ fortuneService.getFortuneService();
    }
}
