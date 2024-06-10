package class_basic.song;

public class SontTest {
    public static void main(String[] args) {
        Song song = new Song();
        String[] a = {"김", "이", "박"};

        song.initSong("제목", "가수", "1집", 2024, a);

        song.printSong();
    }
}
