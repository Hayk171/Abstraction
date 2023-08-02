public class TestClass {
    public static void main(String[] args) {

        Pianist pianist = new Pianist();
        pianist.playing();
        pianist.readNotes();

        BassGuitarist bassGuitarist = new BassGuitarist();
        bassGuitarist.playing();
        bassGuitarist.readNotes();

        ClassicGuitarist classicGuitarist = new ClassicGuitarist();
        classicGuitarist.playing();
        classicGuitarist.playingMozart();
        classicGuitarist.readNotes();
    }
}
