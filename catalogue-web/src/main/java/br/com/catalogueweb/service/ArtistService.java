package br.com.catalogueweb.service;

import br.com.catalogueweb.domain.Artist;

public interface ArtistService {

    Iterable<Artist> findAll();
}
