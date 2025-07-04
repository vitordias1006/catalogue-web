package br.com.catalogweb.service;

import br.com.catalogweb.domain.Artist;

public interface ArtistService {

    Iterable<Artist> findAll();

}
