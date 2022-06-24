package ru.neoflex.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.bookstore.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
