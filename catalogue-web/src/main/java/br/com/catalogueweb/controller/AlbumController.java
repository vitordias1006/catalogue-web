package br.com.catalogueweb.controller;

import br.com.catalogueweb.domain.Album;
import br.com.catalogueweb.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlbumController {

    private final AlbumService albumService;


    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public String showAlbums(Model model) {
        Iterable<Album> albums = albumService.findAll();

        model.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/rate-album")
    public String rateAlbum(@ModelAttribute Album album, Model model) {

        return "albums";
    }

    @PostMapping("/send-rating")
    public String sendRating(@ModelAttribute Album album) {

        return "redirect:/home";
    }


}
