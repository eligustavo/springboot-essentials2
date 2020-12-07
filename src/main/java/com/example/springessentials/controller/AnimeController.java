package com.example.springessentials.controller;

import com.example.springessentials.domain.Anime;
import com.example.springessentials.requests.AnimePostRequestBody;
import com.example.springessentials.requests.AnimePutRequestBody;
import com.example.springessentials.service.AnimeService;
import com.example.springessentials.util.DateUtil;
<<<<<<< HEAD
import lombok.RequiredArgsConstructor;
=======
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public ResponseEntity<Page<Anime>> list(Pageable pageable) {
<<<<<<< HEAD
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll(pageable));
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Anime>> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAllNonPageable());
=======
       log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll(pageable));
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id) {
        return ResponseEntity.ok(animeService.findByIdOrThrowBadRequestException(id));
    }

    @GetMapping(path = "/find")
<<<<<<< HEAD
    public ResponseEntity<List<Anime>> findByName(@RequestParam String nome) {
        return ResponseEntity.ok(animeService.findByNome(nome));
=======
    public ResponseEntity<List<Anime>> findByName(@RequestParam String name) {
        return ResponseEntity.ok(animeService.findByName(name));
>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody @Valid AnimePostRequestBody animePostRequestBody) {
        return new ResponseEntity<>(animeService.save(animePostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody AnimePutRequestBody animePutRequestBody) {
        animeService.replace(animePutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
