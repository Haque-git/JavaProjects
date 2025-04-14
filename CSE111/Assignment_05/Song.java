package CSE111.Assignment_05;

public class Song {
    String title;
    String artist;
    int length;
    Song next;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.next = null;
    }
    public void songInfo() {
        System.out.printf("Title: %s, Artist: %s, Length: %d minutes\n", title, artist, length);
    }
}
