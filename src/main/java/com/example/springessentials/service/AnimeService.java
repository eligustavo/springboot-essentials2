package com.example.springessentials.service;

import com.example.springessentials.domain.Anime;
<<<<<<< HEAD
=======
import com.example.springessentials.exceptions.BadRequestException;
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
import com.example.springessentials.mapper.AnimeMapper;
import com.example.springessentials.repository.AnimeRepository;
import com.example.springessentials.requests.AnimePostRequestBody;
import com.example.springessentials.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
=======
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {


<<<<<<< HEAD
    private final AnimeRepository animeRepository;

    public Page<Anime> listAll(Pageable pageable) {
        return animeRepository.findAll(pageable);
    }

    public List<Anime> listAllNonPageable() {
        return animeRepository.findAll();
=======
    public Page<Anime> listAll(Pageable  pageable) {
        return animeRepository.findAll(pageable);
    }

    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    }

    public List<Anime> findByNome(String nome) {
        return animeRepository.findByNome(nome);
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime não encontrado"));
    }

    @Transactional
    public Anime save(AnimePostRequestBody animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());
        animeRepository.save(anime);
    }

}
