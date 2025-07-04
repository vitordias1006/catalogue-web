package br.com.catalogweb.controller;

import br.com.catalogweb.domain.Artist;
import br.com.catalogweb.service.ArtistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/home")
    public String goBackHome() {
        return "home";
    }


}
