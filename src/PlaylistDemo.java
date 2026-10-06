public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Demo Track ===");
        System.out.println("default track");
        Track default1 = new Track();
        System.out.println(default1 + " \n");
        System.out.println("title-only track");
        Track track1 = new Track("blinding lights");
        System.out.println(track1 + " \n");
        System.out.println("title+artis track");
        Track track2 = new Track("4 raws", "EsDeeKid");
        System.out.println(track2 + " \n");
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Sen ve Yıldız", "Mavi", -10, false);
        System.out.println(invalidTrack + "\n");
        System.out.println("full track");
        Track track3 = new Track("Fırtınadayım", "Mabel Matiz",422, true);
        System.out.println(track3 + " \n");
        System.out.println("Getter Test:");
        Track getterTrack = new Track("Fırtınadayım", "mabel matiz", 422, true);
        System.out.println("Title:    " + getterTrack.getTitle());
        System.out.println("Artist:   " + getterTrack.getArtist());
        System.out.println("Duration: " + getterTrack.getDurationFormatted());
        System.out.println("Explicit: " + getterTrack.isExplicit());
    }

}

