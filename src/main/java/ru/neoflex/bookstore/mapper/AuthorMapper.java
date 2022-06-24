package ru.neoflex.bookstore.mapper;

import org.mapstruct.Mapper;
import ru.neoflex.bookstore.api.dto.AuthorDto;
import ru.neoflex.bookstore.model.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto mapEntityToDto(Author author);
}
