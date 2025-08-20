package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Autor {
    @JsonAlias("name")
    private String nome;

    @JsonAlias("birth_year")
    private Integer nascimento;

    @JsonAlias("death_year")
    private Integer falecimento;

    // Getters, Setters, toString()
}