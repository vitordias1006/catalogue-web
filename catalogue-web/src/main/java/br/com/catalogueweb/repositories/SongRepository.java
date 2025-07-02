package br.com.catalogueweb.repositories;

import br.com.catalogueweb.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
