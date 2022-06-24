package ru.neoflex.bookstore.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.neoflex.bookstore.api.dto.AuthorDto;
import ru.neoflex.bookstore.api.dto.BookAllInfoDto;
import ru.neoflex.bookstore.api.dto.BookNameDto;
import ru.neoflex.bookstore.mapper.AuthorMapper;
import ru.neoflex.bookstore.mapper.BookMapper;
import ru.neoflex.bookstore.model.Author;
import ru.neoflex.bookstore.model.Book;
import ru.neoflex.bookstore.repository.AuthorRepository;
import ru.neoflex.bookstore.repository.BookRepository;


import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookstoreServiceImpl implements BookstoreService{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AuthorMapper authorMapper;
    private final BookMapper bookMapper;

    @Override
    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream().map(authorMapper::mapEntityToDto).collect(Collectors.toList());
    }

    @Override
    public List<BookNameDto> getAllBooks() {
        return bookRepository.findAll().stream().map(bookMapper::mapEntityToBookNameDto).collect(Collectors.toList());
    }

    @Override
    public List<BookNameDto> getBookAuthor(Long authorId) {
        Optional<Author> optionalAuthor = authorRepository.findById(authorId);
        return optionalAuthor
                .map(author -> author.getBooks()
                        .stream()
                        .map(bookMapper::mapEntityToBookNameDto)
                        .collect(Collectors.toList()))
                .orElse(null);
    }

    @Override
    public BookAllInfoDto getAllInfoByBook(Long bookId) {
        return bookRepository.findById(bookId).map(bookMapper::mapEntityToBookAllInfoDto).orElse(null);

    }

    @Override
    public BigDecimal getTotalCostAllBooksAuthor(Long authorId) {
        List<Book> books = authorRepository.findById(authorId).map(Author::getBooks).orElse(null);
        return books.stream().map(Book::getPrice).filter(Objects::nonNull).reduce(BigDecimal::add).orElse(null);
    }
}
