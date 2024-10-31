package ru.alexk.MySpringBoot2DB.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexk.MySpringBoot2DB.dao.DisciplineDAO;
import ru.alexk.MySpringBoot2DB.entity.Discipline;

import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {


    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines() {
        return disciplineDAO.getAllDisciplines();
    }

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineDAO.saveDiscipline(discipline);
    }

    @Override
    @Transactional
    public Discipline getDiscipline(int id) {
        return disciplineDAO.getDiscipline(id);
    }

    @Override
    @Transactional
    public Discipline deleteDiscipline(int id) {
        return disciplineDAO.deleteDiscipline(id);

    }
}
