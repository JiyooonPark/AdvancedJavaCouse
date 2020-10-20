package lecture3;

import java.util.*;

public class Song {
    String title;
    String artist;
    Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public static void main(String [] args){
        ArrayList<Song> list = new ArrayList<>();
        list.add(new Song("hello", "adele"));
        list.add(new Song("good bye", "honne"));
        list.add(new Song("again", "bts"));
        for(Song s: list){
            System.out.println(s.artist + "  " + s.title);
        }

        Song li [] = new Song[3];
        for(int i=0; i<3; i++){
            li[i] = new Song("this "+i, "is");
        }
        for(Song s: li){
            System.out.println(s.artist + "  " + s.title);
        }
    }
}
