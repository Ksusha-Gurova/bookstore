package ru.neoflex.bookstore.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.bookstore.api.dto.AuthorDto;
import ru.neoflex.bookstore.api.dto.BookAllInfoDto;
import ru.neoflex.bookstore.api.dto.BookNameDto;
import ru.neoflex.bookstore.service.BookstoreService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookstore")
public class BookstoreControllerImpl {

    private final BookstoreService bookstoreService;

    @GetMapping("/authors")
    public List<AuthorDto> getAllAuthors() {
        return bookstoreService.getAllAuthors();
    }

    @GetMapping("/books")
    public List<BookNameDto> getAllBooks() {
        return bookstoreService.getAllBooks();
    }

    @GetMapping("/authors/{authorId}/books")
    public List<BookNameDto> getBooksAuthor(@PathVariable Long authorId) {
        return bookstoreService.getBookAuthor(authorId);
    }

    @GetMapping("/books/{bookId}/info")
    public BookAllInfoDto getAllInfoByBook(@PathVariable Long bookId) {
        return bookstoreService.getAllInfoByBook(bookId);
    }

    @GetMapping("/authors/{authorId}/books/total_cost")
    public BigDecimal getTotalCostAllBooksAuthor(@PathVariable Long authorId) {
        return bookstoreService.getTotalCostAllBooksAuthor(authorId);
    }
}
