package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.model.Positions;

import java.time.LocalDate;

@Service
public class CalculateAnnualBonusService implements AnnualBonusService{
    @Override
    public double calculate (Positions positions, double salary, double bonus, int workDays) {

        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();

        int yearDays;

        if((year % 4) == 0){
            yearDays = 366;
        } else {
            yearDays = 365;
        }

        return salary * bonus * yearDays * positions.getPositionCoefficient() / workDays;
    }
}
