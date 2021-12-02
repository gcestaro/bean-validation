package com.github.gcestaro.beanvalidation.models;

import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class Entity {

    @NotBlank
    private String name;

    @Valid
    @NotEmpty
    private List<InnerEntity> innerEntities;
}
