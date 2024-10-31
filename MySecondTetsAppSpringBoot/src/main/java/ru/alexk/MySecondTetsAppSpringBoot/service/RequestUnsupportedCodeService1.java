package ru.alexk.MySecondTetsAppSpringBoot.service;

import ru.alexk.MySecondTetsAppSpringBoot.exception.UnsupportedCodeException;

public interface RequestUnsupportedCodeService1 {
    void isSupportCode(String code) throws UnsupportedCodeException;
}
