package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Gym;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;

import java.util.Arrays;

public class GymValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Gym.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Gym gym = (Gym) target;

        //6.1
        for (Gym existingGym : Hw1Application.gyms){
            if (existingGym.getId()==(gym.getId())){
                errors.rejectValue("id","uniqueId","Invalid Gym Id");
                break;
            }
        }
        //6.2
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "classes", "classesEmpty","Classes cannot be empty");
        //6.3
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "website", "websiteEmpty","Website cannot be empty");
    }
}
