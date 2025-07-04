package br.com.catalogweb.service;

import br.com.catalogweb.domain.Song;

public interface SongService {

    Iterable<Song> findAll();
}
