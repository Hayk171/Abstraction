public class Pianist extends Musician{
    @Override
    public void playing() {
        System.out.println("Play piano");
    }

    @Override
    public void readNotes() {
        System.out.println("Read piano notes");
    }
}
