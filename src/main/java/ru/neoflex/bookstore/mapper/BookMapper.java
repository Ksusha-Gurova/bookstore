package ru.neoflex.bookstore.mapper;

import org.mapstruct.Mapper;
import ru.neoflex.bookstore.api.dto.BookAllInfoDto;
import ru.neoflex.bookstore.api.dto.BookNameDto;
import ru.neoflex.bookstore.model.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookAllInfoDto mapEntityToBookAllInfoDto(Book book);

    BookNameDto mapEntityToBookNameDto(Book book);
}
