package com.example.springessentials.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
public class AnimePostRequestBody {
    @NotEmpty(message = "O nome do anime não pode ser vazio")
    private String nome;

}
