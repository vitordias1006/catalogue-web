package br.com.catalogueweb.bootstrap;

import br.com.catalogueweb.domain.Album;
import br.com.catalogueweb.domain.Artist;
import br.com.catalogueweb.domain.Song;
import br.com.catalogueweb.repositories.AlbumRepository;
import br.com.catalogueweb.repositories.ArtistRepository;
import br.com.catalogueweb.repositories.SongRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;

    public BootStrapData(ArtistRepository artistRepository, AlbumRepository albumRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }

    private void addSongToAlbum(Album album, int trackNumber, String songName) {
        Song song = new Song();
        song.setAlbum(album);
        song.setTrackNumber(trackNumber);
        song.setSongName(songName);
        album.getSongs().add(song);
        songRepository.save(song);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Artist carti = new Artist();
        carti.setName("Playboi Carti");

        Album wlr = new Album();
        wlr.setTitle("Whole Lotta Red");
        wlr.setArtist(carti);
        carti.getAlbums().add(wlr);
        addSongToAlbum(wlr, 1, "Rockstar Made");
        addSongToAlbum(wlr, 2, "Go2DaMoon");
        addSongToAlbum(wlr, 3, "Stop Breathing");
        addSongToAlbum(wlr, 4, "Beno!");
        addSongToAlbum(wlr, 5, "JumpOutTheHouse");
        addSongToAlbum(wlr, 6, "M3tamorphosis");
        addSongToAlbum(wlr, 7, "Slay3r");
        addSongToAlbum(wlr, 8, "No Sl33p");
        addSongToAlbum(wlr, 9, "New Tank");
        addSongToAlbum(wlr, 10, "Teen X");
        addSongToAlbum(wlr, 11, "Meh");
        addSongToAlbum(wlr, 12, "Vamp Anthem");
        addSongToAlbum(wlr, 13, "New N3on");
        addSongToAlbum(wlr, 14, "Control");
        addSongToAlbum(wlr, 15, "Punk Monk");
        addSongToAlbum(wlr, 16, "On That Time");
        addSongToAlbum(wlr, 17, "King Vamp");
        addSongToAlbum(wlr, 18, "Place");
        addSongToAlbum(wlr, 19, "Sky");
        addSongToAlbum(wlr, 20, "Over");
        addSongToAlbum(wlr, 21, "ILoveUIHateU");
        addSongToAlbum(wlr, 22, "Die4Guy");
        addSongToAlbum(wlr, 23, "Not Playing");
        addSongToAlbum(wlr, 24, "F33l Lik3 Dyin");

        Album music = new Album();
        music.setTitle("Music");
        wlr.setArtist(carti);
        music.setReleaseYear("2025");
        carti.getAlbums().add(music);
        addSongToAlbum(music, 1, "Pop Out");
        addSongToAlbum(music, 2, "Crush (featuring Travis Scott)");
        addSongToAlbum(music, 3, "K Pop");
        addSongToAlbum(music, 4, "Evil Jordan");
        addSongToAlbum(music, 5, "Mojo Jojo (featuring Kendrick Lamar)");
        addSongToAlbum(music, 6, "Philly (featuring Travis Scott)");
        addSongToAlbum(music, 7, "Radar");
        addSongToAlbum(music, 8, "Rather Lie (featuring The Weeknd)");
        addSongToAlbum(music, 9, "Fine Shit");
        addSongToAlbum(music, 10, "Backdoor (featuring Kendrick Lamar)");
        addSongToAlbum(music, 11, "Toxic (featuring Future and Skepta)");
        addSongToAlbum(music, 12, "Munyun");
        addSongToAlbum(music, 13, "Crank");
        addSongToAlbum(music, 14, "Charge Dem Hoes A Fee (featuring Future and Travis Scott)");
        addSongToAlbum(music, 15, "Good Credit (featuring Kendrick Lamar)");
        addSongToAlbum(music, 16, "I Seeee You Baby Boi");
        addSongToAlbum(music, 17, "Wake Up F1lthy (featuring Travis Scott)");
        addSongToAlbum(music, 18, "Jumpin (featuring Lil Uzi Vert)");
        addSongToAlbum(music, 19, "Trim (featuring Future)");
        addSongToAlbum(music, 20, "Cocaine Nose");
        addSongToAlbum(music, 21, "We Need All Da Vibes (featuring Ty Dolla $ign & Young Thug)");
        addSongToAlbum(music, 22, "Olympian");
        addSongToAlbum(music, 23, "Opm Babi");
        addSongToAlbum(music, 24, "Twin Trim (featuring Lil Uzi Vert)");
        addSongToAlbum(music, 25, "Like Weezy");
        addSongToAlbum(music, 26, "Dis 1 Got It");
        addSongToAlbum(music, 27, "Walk");
        addSongToAlbum(music, 28, "HBA");
        addSongToAlbum(music, 29, "Overly");
        addSongToAlbum(music, 30, "South Atlanta Baby");

        Album dieLit = new Album();
        dieLit.setTitle("Die Lit");
        dieLit.setArtist(carti);
        dieLit.setReleaseYear("2018");
        carti.getAlbums().add(dieLit);
        addSongToAlbum(dieLit, 1, "Long Time (Intro)");
        addSongToAlbum(dieLit, 2, "R.I.P.");
        addSongToAlbum(dieLit, 3, "Lean 4 Real (feat. Skepta)");
        addSongToAlbum(dieLit, 4, "Old Money");
        addSongToAlbum(dieLit, 5, "Love Hurts (feat. Travis Scott)");
        addSongToAlbum(dieLit, 6, "Shoota (feat. Lil Uzi Vert)");
        addSongToAlbum(dieLit, 7, "Right Now (feat. Pi'erre Bourne)");
        addSongToAlbum(dieLit, 8, "Poke It Out (feat. Nicki Minaj)");
        addSongToAlbum(dieLit, 9, "Home (KOD)");
        addSongToAlbum(dieLit, 10, "Fell In Luv (feat. Bryson Tiller)");
        addSongToAlbum(dieLit, 11, "Foreign");
        addSongToAlbum(dieLit, 12, "Pull Up");
        addSongToAlbum(dieLit, 13, "Mileage (feat. Chief Keef)");
        addSongToAlbum(dieLit, 14, "FlatBed Freestyle");
        addSongToAlbum(dieLit, 15, "No Time (feat. Gunna)");
        addSongToAlbum(dieLit, 16, "Middle of the Summer (feat. Red Coldhearted)");
        addSongToAlbum(dieLit, 17, "Choppa Won’t Miss (feat. Young Thug)");
        addSongToAlbum(dieLit, 18, "R.I.P. Fredo (Notice Me)");
        addSongToAlbum(dieLit, 19, "Top");

        Album selfTitled = new Album();
        selfTitled.setTitle("Playboi Carti");
        selfTitled.setArtist(carti);
        selfTitled.setReleaseYear("2017");
        carti.getAlbums().add(selfTitled);
        addSongToAlbum(selfTitled, 1, "Location");
        addSongToAlbum(selfTitled, 2, "Magnolia");
        addSongToAlbum(selfTitled, 3, "Lookin");
        addSongToAlbum(selfTitled, 4, "Wokeuplikethis");
        addSongToAlbum(selfTitled, 5, "Let It Go");
        addSongToAlbum(selfTitled, 6, "Half & Half");
        addSongToAlbum(selfTitled, 7, "New Choppa");
        addSongToAlbum(selfTitled, 8, "Other Shit");
        addSongToAlbum(selfTitled, 9, "No. 9");
        addSongToAlbum(selfTitled, 10, "Lame Niggaz");
        addSongToAlbum(selfTitled, 11, "Yah Mean");
        addSongToAlbum(selfTitled, 12, "Flex");
        addSongToAlbum(selfTitled, 13, "Kelly K");
        addSongToAlbum(selfTitled, 14, "Had 2");

         artistRepository.save(carti);
         albumRepository.save(wlr);
         albumRepository.save(dieLit);
         albumRepository.save(music);
         albumRepository.save(selfTitled);

        Artist che = new Artist();
        che.setName("Che");

        Album ss = new Album();
        ss.setTitle("Sayso Says");
        ss.setArtist(che);
        ss.setReleaseYear("2024");
        che.getAlbums().add(ss);
        addSongToAlbum(ss, 1, "I Rot, I Rot.");
        addSongToAlbum(ss, 2, "SASKA YOU MADE IT");
        addSongToAlbum(ss, 3, "Pretend We're Sleeping");
        addSongToAlbum(ss, 4, "GET NAKED");
        addSongToAlbum(ss, 5, "ENJOY YOUR LIFE");
        addSongToAlbum(ss, 6, "Been There, Done That");
        addSongToAlbum(ss, 7, "Hex On My Chest, It's Going Down");
        addSongToAlbum(ss, 8, "Pissy Coffee");
        addSongToAlbum(ss, 9, "Interlude");
        addSongToAlbum(ss, 10, "It’s My Party and I’ll Die If I Want To");
        addSongToAlbum(ss, 11, "DON’T TELL NO1");
        addSongToAlbum(ss, 12, "NUNCA HACER COCAINA");
        addSongToAlbum(ss, 13, "School Girl Sashimi");
        addSongToAlbum(ss, 14, "YDFWMNM?");
        addSongToAlbum(ss, 15, "Children Shouldn’t Play With Dead Things");
        addSongToAlbum(ss, 16, "CUT OFF YOUR HANDS");
        addSongToAlbum(ss, 17, "My Favorite Color is Red");

        Album cc = new Album();
        cc.setTitle("Closed Captions");
        cc.setArtist(che);
        cc.setReleaseYear("2023");
        che.getAlbums().add(cc);
        addSongToAlbum(cc, 1, "bluberry bakwood");
        addSongToAlbum(cc, 2, "frank ocean");
        addSongToAlbum(cc, 3, "flat (bonus)");
        addSongToAlbum(cc, 4, "sativa");
        addSongToAlbum(cc, 5, "fangs");
        addSongToAlbum(cc, 6, "?????");
        addSongToAlbum(cc, 7, "sol");
        addSongToAlbum(cc, 8, "canary");
        addSongToAlbum(cc, 9, "blac chyna");
        addSongToAlbum(cc, 10, "sos");
        addSongToAlbum(cc, 11, "draco draco");

        artistRepository.save(che);
        albumRepository.save(ss);
        albumRepository.save(cc);

        Artist lilO = new Artist();
        lilO.setName("Osamason");

        Album flxtra = new Album();
        flxtra.setTitle("Flxtra");
        flxtra.setArtist(lilO);
        flxtra.setReleaseYear("2024");
        lilO.getAlbums().add(flxtra);
        addSongToAlbum(flxtra, 1, "Cartel");
        addSongToAlbum(flxtra, 2, "Rehhab");
        addSongToAlbum(flxtra, 3, "Need It");
        addSongToAlbum(flxtra, 4, "Alot");
        addSongToAlbum(flxtra, 5, "Flxr");
        addSongToAlbum(flxtra, 6, "Freestyle");
        addSongToAlbum(flxtra, 7, "Blonde");
        addSongToAlbum(flxtra, 8, "Baghdad");
        addSongToAlbum(flxtra, 9, "All Star");
        addSongToAlbum(flxtra, 10, "For Da Flex");
        addSongToAlbum(flxtra, 11, "Worst Part");
        addSongToAlbum(flxtra, 12, "Trenches");
        addSongToAlbum(flxtra, 13, "Nothing");
        addSongToAlbum(flxtra, 14, "3x");
        addSongToAlbum(flxtra, 15, "Boss Up");
        addSongToAlbum(flxtra, 16, "Kills");
        addSongToAlbum(flxtra, 17, "Kome Thru");
        addSongToAlbum(flxtra, 18, "Me When");
        addSongToAlbum(flxtra, 19, "Uno");
        addSongToAlbum(flxtra, 20, "Str8 Flexin");
        addSongToAlbum(flxtra, 21, "Congrats");
        addSongToAlbum(flxtra, 22, "Pop");
        addSongToAlbum(flxtra, 23, "Talking 2 A Ghost");

        Album jumpout = new Album();
        jumpout.setTitle("Jumpout");
        jumpout.setArtist(lilO);
        jumpout.setReleaseYear("2025");
        lilO.getAlbums().add(jumpout);
        addSongToAlbum(jumpout, 1, "Southside");
        addSongToAlbum(jumpout, 2, "Fool");
        addSongToAlbum(jumpout, 3, "GTFO The Room");
        addSongToAlbum(jumpout, 4, "Made Sum Plans");
        addSongToAlbum(jumpout, 5, "Break Da News");
        addSongToAlbum(jumpout, 6, "Room 156");
        addSongToAlbum(jumpout, 7, "Jumpout");
        addSongToAlbum(jumpout, 8, "Going Dumbo");
        addSongToAlbum(jumpout, 9, "She Need A Ride");
        addSongToAlbum(jumpout, 10, "New Tune");
        addSongToAlbum(jumpout, 11, "Waffle House");
        addSongToAlbum(jumpout, 12, "I Got The Fye");
        addSongToAlbum(jumpout, 13, "Insta");
        addSongToAlbum(jumpout, 14, "Frontin");
        addSongToAlbum(jumpout, 15, "Mufasa");
        addSongToAlbum(jumpout, 16, "Ref");
        addSongToAlbum(jumpout, 17, "The Whole World Is Free");
        addSongToAlbum(jumpout, 18, "Round Of Applause");

        artistRepository.save(lilO);
        albumRepository.save(flxtra);
        albumRepository.save(jumpout);

        System.out.println("In BootStrap:");
        System.out.println("Artist count: " + artistRepository.count());
        System.out.println("Album count: " + albumRepository.count());
        System.out.println("Song count: " + songRepository.count());

    }
}
