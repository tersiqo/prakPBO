import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("19948202", "Widia, S.Kom, M.Kom", "199402");
        Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");

        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();

        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);
        
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());

        System.out.println("\n=== DATA DOSEN ===");
        dosen1.displayInfo();
        dosen1.mengajar(); 
        System.out.println("--------------------");
        dosen2.displayInfo();
        
        System.out.println("\n=== DATA TENAGA KEPENDIDIKAN ===");
        tendik1.displayInfo();
        System.out.println("--------------------");
        tendik2.displayInfo();
    }
}