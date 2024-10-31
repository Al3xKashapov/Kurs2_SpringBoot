package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify (Response response);
}
