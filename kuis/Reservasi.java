import java.util.ArrayList;
import java.util.List;

public class Reservasi {
    private String tanggal;
    private int durasi;
    private Ruangan ruangan; 
    private List<Mahasiswa> daftarMahasiswa;

    public Reservasi(String tanggal, int durasi, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan; 
        this.daftarMahasiswa = new ArrayList<>(); 
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilReservasi() {
        System.out.println("   Detail Reservasi ");
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("Durasi: " + this.durasi + " jam");
        
        System.out.println("\n--- Informasi Ruangan ---");
        System.out.println("Kode Ruangan: " + ruangan.getKodeRuangan());
        System.out.println("Nama Ruangan: " + ruangan.getNamaRuangan());
        System.out.println("Kapasitas: " + ruangan.getKapasitas());
        System.out.println("Status: " + ruangan.getStatus());
        
        System.out.println("\n--- Daftar Mahasiswa ---");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada mahasiswa terdaftar.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println("- " + m.getNama() + " (" + m.getNim() + ")");
            }
        }
    }
}