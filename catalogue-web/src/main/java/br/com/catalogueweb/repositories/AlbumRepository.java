package br.com.catalogueweb.repositories;

import br.com.catalogueweb.domain.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
