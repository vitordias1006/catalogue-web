package br.com.catalogweb.controller;

import br.com.catalogweb.domain.Album;
import br.com.catalogweb.repositories.AlbumRepository;
import br.com.catalogweb.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlbumController {

    private final AlbumService albumService;
    private final AlbumRepository albumRepository;


    public AlbumController(AlbumService albumService, AlbumRepository albumRepository) {
        this.albumService = albumService;
        this.albumRepository = albumRepository;
    }

    @GetMapping("/albums")
    public String showAlbums(Model model) {
        Iterable<Album> albums = albumService.findAll();

        model.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/rate-album")
    public String rateAlbum(@ModelAttribute Album album, Model model) {
        model.addAttribute("album", album);
        return "albums";
    }

    @PostMapping("/send-rating")
    public String sendRating(@ModelAttribute Album album, Model model) {
        Album albumCompleto = albumService.findById(album.getId());

        if (albumCompleto != null) {
            albumCompleto.setRate(album.getRate());
            albumRepository.save(albumCompleto);
            model.addAttribute("mensagem", "Avaliação enviada com sucesso para " + albumCompleto.getTitle());
            model.addAttribute("albumAvaliado", albumCompleto);
        }else {
            model.addAttribute("erro", "album não encontrado");
        }
        model.addAttribute("albums", albumService.findAll());
        return "albums";
    }


}
