package br.com.catalogweb.service;

import br.com.catalogweb.domain.Album;

public interface AlbumService {

    Iterable<Album> findAll();
    Album findById(Long id);
}
