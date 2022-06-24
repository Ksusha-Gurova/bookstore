package ru.neoflex.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
