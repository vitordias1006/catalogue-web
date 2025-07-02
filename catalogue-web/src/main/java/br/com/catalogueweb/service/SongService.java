package br.com.catalogueweb.service;

import br.com.catalogueweb.domain.Song;

public interface SongService {

    Iterable<Song> findAll();
}
