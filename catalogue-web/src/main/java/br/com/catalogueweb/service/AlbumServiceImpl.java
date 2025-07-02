package br.com.catalogueweb.service;

import br.com.catalogueweb.domain.Album;
import br.com.catalogueweb.repositories.AlbumRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public Iterable<Album> findAll() {
        return albumRepository.findAll();
    }
}
