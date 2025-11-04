public class Lebah extends Hewan{
public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bergerak'");
    }

    @Override
    public void bernapas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bernapas'");
    }

     @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta   : " + this.kasta);
    }
}