package ru.sf.restapivdsdocker.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UsersDto implements Serializable {

    private Long id;
    @NotBlank
    private String lastName;
    @NotBlank
    private String firstName;
}