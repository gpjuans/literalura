package com.aluracursos.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookData(
        @JsonAlias("id") Long gutendexId,
        @JsonAlias("title") String title,
        @JsonAlias("authors") List<Person> authors,
        @JsonAlias("languages") List<String> languages,
        @JsonAlias("download_count") Long downloadCount
        ) {
}
