package ru.alexk.MySpringBoot2DB.service;

import org.springframework.stereotype.Service;
import ru.alexk.MySpringBoot2DB.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent (int id);

    Student  deleteStudent (int id);

}
