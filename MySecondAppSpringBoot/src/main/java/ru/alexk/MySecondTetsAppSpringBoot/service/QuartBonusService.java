package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.model.Positions;

@Service
public interface QuartBonusService {
    double calculate (Positions positions, double salary, double bonus, int workDays);
}
