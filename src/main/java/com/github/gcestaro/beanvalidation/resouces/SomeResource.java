package com.github.gcestaro.beanvalidation.resouces;

import com.github.gcestaro.beanvalidation.models.Entity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/some")
public class SomeResource {

    @PostMapping
    public void process(@RequestBody @Valid Entity entity) {

        log.info("Valid entity: {}", entity);
    }
}
