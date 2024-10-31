package ru.alexk.MyDbLr8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexk.MyDbLr8.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}