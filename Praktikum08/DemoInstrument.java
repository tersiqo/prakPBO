public class DemoInstrument {
    public static void main(String[] args) {
        Guitar gitar = new Guitar("Gitar Akustik", 6);
        gitar.info();
        gitar.tune();
        gitar.play();

        System.out.println("----------------------------");

        Drum drum = new Drum("Drum Elektrik", 40);
        drum.info();
        drum.tune();
        drum.play();
    }
}
