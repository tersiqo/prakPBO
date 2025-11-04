public class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Nama instrumen: " + name);
    }

    public void tune() {
        System.out.println(name + " sedang disetel agar menghasilkan nada yang tepat.");
    }

    public void play() {
        System.out.println("Memainkan " + name + " dengan cara umum (tidak spesifik).");
    }
}
