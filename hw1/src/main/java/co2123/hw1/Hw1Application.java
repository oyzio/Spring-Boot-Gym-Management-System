package co2123.hw1;

import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {

    public static List<Gym> gyms = new ArrayList<Gym>();

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);

        initialiseGymList();
    }

    private static void initialiseGymList() {

        Trainer firstTrainer = new Trainer();
        firstTrainer.setName("Leroy David");
        firstTrainer.setSkills("Bodybuilding and Cardio");
        firstTrainer.setExpertise("Bodybuilding");
        firstTrainer.setDuration(3);

        Trainer secondTrainer = new Trainer();
        secondTrainer.setName("Charles Johnson");
        secondTrainer.setSkills("Calisthenics");
        secondTrainer.setExpertise("Nutrition");
        secondTrainer.setDuration(10);

        Gym firstGym = new Gym();
        firstGym.setId(1);
        firstGym.setClasses("Resistance, Free Weights, Calisthenics and Cardio");
        firstGym.setWebsite("https://firstgym.co.uk");

        //MUTABLE LIST I ACCIDENTALLLY USED IMMUTABLE ORIGINALLY
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(firstTrainer);
        trainers.add(secondTrainer);
        firstGym.setTrainers(trainers);

        gyms.add(firstGym);
    }
}