package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
