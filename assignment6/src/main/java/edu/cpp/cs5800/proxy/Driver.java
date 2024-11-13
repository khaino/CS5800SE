package edu.cpp.cs5800.proxy;

import static edu.cpp.cs5800.proxy.Util.log;

public class Driver {
    public static void main(String[] args) {
        SongService songService = new ProxySongService();
        log("------Search songs by id------");
        log(songService.searchById(3).toString());
        log(songService.searchById(5).toString());
        log(songService.searchById(3).toString());
        System.out.println();
        log("------Search songs by title------");
        log(songService.searchByTitle("Shape of You").toString());
        log(songService.searchByTitle("Sunflower").toString());
        log(songService.searchByTitle("Shape of You").toString());
        System.out.println();
        log("------Search songs by album------");
        log(songService.searchByAlbum("TwentyOne").toString());
        log(songService.searchByAlbum("Camila").toString());
        log(songService.searchByAlbum("TwentyOne").toString());
    }
}
