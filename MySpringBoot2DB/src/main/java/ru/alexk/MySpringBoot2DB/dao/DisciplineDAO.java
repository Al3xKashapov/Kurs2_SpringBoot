package ru.alexk.MySpringBoot2DB.dao;

import org.springframework.stereotype.Repository;
import ru.alexk.MySpringBoot2DB.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineDAO {

    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline (Discipline discipline);

    Discipline getDiscipline (int id);

    Discipline deleteDiscipline (int id);
}
