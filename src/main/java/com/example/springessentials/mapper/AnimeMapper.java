package com.example.springessentials.mapper;

import com.example.springessentials.domain.Anime;
import com.example.springessentials.requests.AnimePostRequestBody;
import com.example.springessentials.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

<<<<<<< HEAD
    public abstract Anime toAnime(AnimePutRequestBody animePostRequestBody);;
=======
    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

>>>>>>> 750fd3ede00f34e39365a393a9c6489ade0b97f2
}
