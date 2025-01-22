package JavaPrograms;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import java.util.Random;

public class RandomNumbersAndStrings {

    @Test
    void randomNumbers(){
        Random rand = new Random();
        int value = rand.nextInt(100);
        System.out.println(value);

        System.out.println(rand.nextDouble()); // between 0 and 1

        //Math class
        System.out.println(Math.random()); //default double value
    }

    @Test
    void apachePOI(){
        int numeric = Integer.parseInt(RandomStringUtils.randomNumeric(4));
        System.out.println(numeric);

        System.out.println(RandomUtils.nextInt());

        String alpha = RandomStringUtils.randomAlphabetic(8);
        System.out.println(alpha);

        String alphanumeric = RandomStringUtils.randomAlphanumeric(5);
        System.out.println(alphanumeric);
    }
}
