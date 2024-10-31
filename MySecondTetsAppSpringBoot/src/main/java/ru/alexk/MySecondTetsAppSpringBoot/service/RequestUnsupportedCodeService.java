package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.exception.UnsupportedCodeException;

@Service
public class RequestUnsupportedCodeService implements RequestUnsupportedCodeService1 {
    @Override
    public void isSupportCode(String code) throws UnsupportedCodeException {
        if (code.equals("123")) throw new UnsupportedCodeException("Значение указанное в Uid не поддерживается.");
    }
}
