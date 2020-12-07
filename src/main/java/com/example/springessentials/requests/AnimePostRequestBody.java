package com.example.springessentials.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "Anime não pode ser vazio")
    private String nome;

}
