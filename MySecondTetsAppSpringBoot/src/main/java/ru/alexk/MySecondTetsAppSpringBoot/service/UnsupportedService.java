package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.exception.UnsupportedCodeException;

@Service
public interface UnsupportedService {
    void isSupportCode(String code) throws UnsupportedCodeException;
}
