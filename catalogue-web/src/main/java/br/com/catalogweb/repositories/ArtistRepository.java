package br.com.catalogweb.repositories;

import br.com.catalogweb.domain.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
