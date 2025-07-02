package br.com.catalogueweb.repositories;

import br.com.catalogueweb.domain.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
