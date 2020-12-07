package com.example.springessentials.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "O nome do anime não pode ser vazio")
    private String nome;

}
