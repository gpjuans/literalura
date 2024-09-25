package com.aluracursos.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record PersonData(
        @JsonAlias("birth_year") Long birthYear,
        @JsonAlias("death_year") Long deathYear,
        @JsonAlias("name") String name
        ) {
}
