package ru.alexk.MySpringBoot2DB.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySpringBoot2DB.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {

    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline (int id);

    Discipline  deleteDiscipline (int id);

}
