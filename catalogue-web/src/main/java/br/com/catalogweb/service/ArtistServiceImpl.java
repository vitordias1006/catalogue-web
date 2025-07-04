package br.com.catalogweb.service;

import br.com.catalogweb.domain.Artist;
import br.com.catalogweb.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Iterable<Artist> findAll() {
        return artistRepository.findAll();
    }
}
