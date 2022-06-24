package ru.neoflex.bookstore.service;

import ru.neoflex.bookstore.api.dto.AuthorDto;
import ru.neoflex.bookstore.api.dto.BookAllInfoDto;
import ru.neoflex.bookstore.api.dto.BookNameDto;

import java.math.BigDecimal;
import java.util.List;

public interface BookstoreService {
    List<AuthorDto> getAllAuthors();

    List<BookNameDto> getAllBooks();

    List<BookNameDto> getBookAuthor(Long authorId);

    BookAllInfoDto getAllInfoByBook(Long bookId);

    BigDecimal getTotalCostAllBooksAuthor(Long authorId);
}
