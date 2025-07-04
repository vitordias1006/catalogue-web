package br.com.catalogweb.repositories;

import br.com.catalogweb.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
