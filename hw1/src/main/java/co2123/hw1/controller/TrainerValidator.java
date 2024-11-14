package co2123.hw1.controller;

import co2123.hw1.domain.Gym;
import co2123.hw1.domain.Trainer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.List;

public class TrainerValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Trainer.class.equals(clazz);
    }

    public static List<String> validExpertise = List.of("Tai Chi", "Pilates", "Yoga");
    @Override
    public void validate(Object target, Errors errors) {
        Trainer trainer = (Trainer) target;
        //6.1
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "nameEmpty","Name cannot be empty");
        //6.2
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "skills", "skillsEmpty","Skills cannot be empty");
        //6.3
        if (!validExpertise.contains(trainer.getExpertise())) {
            errors.rejectValue("expertise", "emptyExpertise","Invalid expertise");
        }
        //6.4
        if (trainer.getDuration()<45 || trainer.getDuration()>60) {
            errors.rejectValue("duration", "invalidDuration", "Duration must be between (including) 45 and 60");
        }
    }
}
