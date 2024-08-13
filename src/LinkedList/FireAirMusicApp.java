package LinkedList;


public class FireAirMusicApp {
   static class SongNode {
    String songName;
    SongNode next;

    public SongNode(String songName) {
        this.songName=songName;
        this.next=null;
    }
}

    private SongNode head;

    public void printAllSongs() {
        SongNode current=head;
        while (current!=null) {
            System.out.println(current.songName);
            current=current.next;
        }
    }

    public void addSongAtStart(String songName) {
        SongNode newNode=new SongNode(songName);
        newNode.next=head;
        head=newNode;
    }

    public void addSongAtEnd(String songName) {
        SongNode newNode=new SongNode(songName);
        if (head==null) {
            head=newNode;
        } else {
            SongNode current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }

    public void deleteSong(String songName) {
        if (head==null) {
            return;
        }

        if (head.songName.equals(songName)) {
            head=head.next;
            return;
        }
        SongNode current=head;
        SongNode prev=null;

        while (current!=null && !current.songName.equals(songName)) {
            prev=current;
            current=current.next;
        }

        if (current!=null) {
            prev.next=current.next;
        }
    }
    public boolean searchSong(String songName) {
        SongNode current=head;
        while (current!=null) {
            if (current.songName.equalsIgnoreCase(songName)) {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        FireAirMusicApp musicApp = new FireAirMusicApp();
        musicApp.addSongAtStart("Ek Zindagi");
        musicApp.addSongAtEnd("Tu hai Kahan");
        musicApp.addSongAtEnd("Waqt ki baatain");

        System.out.println("All Songs:");
        musicApp.printAllSongs();

        System.out.println("Search Result: " + musicApp.searchSong("Tu hai kahan"));

        musicApp.deleteSong("Waqt ki baatain");

        System.out.println("\nAll Songs after Deletion:");
        musicApp.printAllSongs();
    }
}

