package CSE111.Assignment_05;

public class Playlist {
    String name;
    Song start;

    public Playlist(String name) {
        this.name = name;
        this.start = null;
        System.out.println(this.name + " created.");
    }

    public void info() {
        System.out.println(name + " has the following songs:");
        if (start == null) {
            System.out.printf("No songs in %s.\n", name);
            return;
        }
        Song current = start;
        while (current != null) {
            current.songInfo();
            current = current.next;
        }
    }

    public void addSong(Song song) {
        if (start == null) {
            start = song;
        } else {
            Song current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = song;
        }

        System.out.printf("%s added to %s.\n", song.title, name);
    }

    private Song getPrevSong(int position) {
        if (position < 0) {
            return null;
        }
        Song current = start;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return null;
        }
        return current;
    }
    
    public void addSong(Song song, int position) {
        Song prevSong = getPrevSong(position);
        if (prevSong == null) {
            System.out.printf("Cannot add song to Index %d.\n", position);
            return;
        } else {
            song.next = prevSong.next;
            prevSong.next = song;
            System.out.printf("%s added to %s.\n", song.title, name);
        }
    }


    public void playSong(String title) {
        Song current = start;
        while (current != null) {
            if (current.title.equals(title)) {
                System.out.printf("Playing %s by %s\n", current.title, current.artist);
                return;
            }
            current = current.next;
        }
        System.out.printf("%s not found in %s.\n", title, name);
    }

    public void playSong(int index) {
        Song prevSong = getPrevSong(index);
        if (prevSong == null) {
            System.out.printf("Song at index %d not found in %s\n", index, name);
            return;
        } else {
            Song current = prevSong.next;
            if (current != null) {
                System.out.printf("Playing %s by %s\n", current.title, current.artist);
            } else {
                System.out.printf("Song at index %d not found in %s\n", index, name);
            }
        }
    }

    public void deleteSong(String title) {
        if (start == null) {
            System.out.printf("%s not found in %s.\n", title, name);
            return;
        }

        if (start.title.equals(title)) {
            start = start.next;
            System.out.printf("%s deleted from %s.\n", title, name);
            return;
        }
        Song current = start;
        while (current.next != null) {
            if (current.next.title.equals(title)) {
                current.next = current.next.next;
                System.out.printf("%s deleted from %s.\n", title, name);
                return;
            }
            current = current.next;
        }
        System.out.printf("%s not found in %s.\n", title, name);
    }

    public int totalSong() {
        int count = 0;
        Song current = start;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void merge(Playlist other) {
        if (other.start == null) {
            System.out.printf("No songs to merge from %s.\n", other.name);
            return;
        }
        if (start == null) {
            start = other.start;
        } else {
            Song current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = other.start;
        }
        System.out.println("Merge completed!");
    }
}
