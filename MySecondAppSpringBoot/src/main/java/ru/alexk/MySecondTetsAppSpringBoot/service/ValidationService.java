package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.validation.BindingResult;
import ru.alexk.MySecondTetsAppSpringBoot.exception.ValidationFailedException;

public interface ValidationService {

    void isValid (BindingResult bindingResult) throws ValidationFailedException;

}
