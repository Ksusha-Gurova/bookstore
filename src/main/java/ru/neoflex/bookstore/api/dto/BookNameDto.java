package ru.neoflex.bookstore.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class BookNameDto {

    private Long id;
    private String name;
    private BigDecimal price;
}
