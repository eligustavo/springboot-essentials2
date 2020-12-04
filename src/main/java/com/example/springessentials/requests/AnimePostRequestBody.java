package com.example.springessentials.requests;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "O nome do anime não pode ser vazio")
    private String name;

}
