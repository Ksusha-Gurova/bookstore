package ru.neoflex.bookstore.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
public class BookAllInfoDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private Set<AuthorDto> authors;
}
