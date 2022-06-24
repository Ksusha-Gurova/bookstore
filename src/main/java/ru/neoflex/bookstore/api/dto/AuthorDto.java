package ru.neoflex.bookstore.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthorDto {
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
}
