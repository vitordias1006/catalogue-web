package br.com.catalogueweb.service;

import br.com.catalogueweb.domain.Song;
import br.com.catalogueweb.repositories.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }
}
