package com.example.springessentials.requests;

import lombok.Data;

<<<<<<< HEAD
import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "Anime não pode ser vazio")
    private String nome;
=======
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "O nome do anime não pode ser vazio")
    private String name;
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2

}
