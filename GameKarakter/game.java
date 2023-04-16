package game;

public class Game {
    public static void main(String[] args) {
        Karakter pemain = new Karakter("pemain", 100, 10, 5);
        Karakter musuh = new Karakter("musuh", 50, 5, 2);

        pemain.serang(musuh);
    }
}