package ru.hogwarts.hogwartswebsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.hogwartswebsql.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

    Optional<Avatar> findByStudentId(Long studentId);
}
