package ru.alexk.MyDbLr8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alexk.MyDbLr8.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
