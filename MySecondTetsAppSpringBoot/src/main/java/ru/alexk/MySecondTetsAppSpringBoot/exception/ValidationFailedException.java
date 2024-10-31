package ru.alexk.MySecondTetsAppSpringBoot.exception;

public class ValidationFailedException extends Throwable {
    public ValidationFailedException(String message) { super(message); }
}
