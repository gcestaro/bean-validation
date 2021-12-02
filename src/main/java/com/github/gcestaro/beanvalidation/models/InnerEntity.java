package com.github.gcestaro.beanvalidation.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;

@Data
public class InnerEntity {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Past
    @NotNull
    private LocalDateTime date;
}
