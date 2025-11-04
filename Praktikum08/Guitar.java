public class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, int strings) {
        super(name);
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Memetik gitar " + name + " dengan " + strings + " senar.");
    }
}
