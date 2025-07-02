package br.com.catalogueweb.service;

import br.com.catalogueweb.domain.Album;

public interface AlbumService {

    Iterable<Album> findAll();
}
