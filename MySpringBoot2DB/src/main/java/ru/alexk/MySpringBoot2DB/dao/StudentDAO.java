package ru.alexk.MySpringBoot2DB.dao;

import org.springframework.stereotype.Repository;
import ru.alexk.MySpringBoot2DB.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudent (int id);

    Student deleteStudent (int id);
}
