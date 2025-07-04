package br.com.catalogweb.repositories;

import br.com.catalogweb.domain.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
