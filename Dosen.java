// package src.t2;
// import src.t1.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Objel dari class Dosen dibuat");
    }

    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}