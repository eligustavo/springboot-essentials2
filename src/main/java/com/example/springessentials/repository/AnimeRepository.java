package com.example.springessentials.repository;

import com.example.springessentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
