package spring.demo.ioc;


public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortuneService() {
        return "Today is your lucky day";
    }

}
