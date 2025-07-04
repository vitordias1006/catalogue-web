package br.com.catalogweb.service;

import br.com.catalogweb.domain.Song;
import br.com.catalogweb.repositories.SongRepository;
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
