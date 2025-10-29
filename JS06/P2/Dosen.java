package P2;
import P1.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

//    public Dosen() {
//       System.out.println("Objek dari class Dosen dibuat" + gaji);
//        this.gaji = gaji;
//    }
    
    public Dosen(String nip, String nama, Double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }
    
    public String getAllInfo() {
        String info = "";
        info += "NIP    : " + super.nip + "\n";
        info += "Nama   : " + super.nama + "\n";
        info += "Gaji   : " + super.gaji + "\n";
        info += "NIDN   : " + this.nidn + "\n";

        return info;
    }
}