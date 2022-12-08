package spring.demo.ioc;

import java.util.Random;

public class RandomFortuneService implements FortuneService{


    private String [] data= {"Today is the first day of the year", "Yesterday is the last day of the year", "This is the new class"};

    private Random rand = new Random();



    @Override
    public String getFortuneService() {

        int index = rand.nextInt(data.length);
        return data[index];
    }
}
