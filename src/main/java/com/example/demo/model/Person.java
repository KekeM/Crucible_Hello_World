package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

//@Setter
//@Getter
public class Person {

    private final UUID id;

    @NotBlank
    private String name;

    public Person(@JsonProperty("id") UUID id, @NotBlank @JsonProperty("id") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
