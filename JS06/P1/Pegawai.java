package P1;

public class Pegawai {
    public String nip;
    public String nama;
    protected double gaji;

//    public Pegawai() {
//        System.out.println("Objek dari class Pegawai dibuat");
//    }

    public Pegawai (String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public double getGaji() {
        return gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        info += "Gaji : " + gaji + "\n";

        return info;
    }
}
