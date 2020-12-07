package com.example.springessentials.repository;

import com.example.springessentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

<<<<<<< HEAD
    List<Anime> findByNome(String nome);
=======
    List<Anime> findByName(String name);
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2

}
