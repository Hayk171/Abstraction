public abstract class Guitarist extends Musician{

    @Override
    public abstract void playing();

    @Override
    public void readNotes() {
        System.out.println("Read guitar notes");
    }
}
