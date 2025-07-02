package br.com.catalogueweb.controller;

import br.com.catalogueweb.domain.Artist;
import br.com.catalogueweb.service.ArtistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public String artistList(Model model) {
        Iterable<Artist> artists = artistService.findAll();

        model.addAttribute("artists", artists);
        return "artists";
    }

    @RequestMapping("/albums")
    public String listArtists() {
        return "albums";
    }
}
