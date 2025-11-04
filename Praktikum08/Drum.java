public class Drum extends Instrument {
    private int diameter;

    public Drum(String name, int diameter) {
        super(name);
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Menabuh drum " + name + " dengan diameter " + diameter + " cm.");
    }
}
