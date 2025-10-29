public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan labKomputer = new Ruangan("LIG1", "Lab Komputer", 30, "tersedia");
        
        Mahasiswa mahasiswa1 = new Mahasiswa("244107060012", "Arif Muhammad");
        Mahasiswa mahasiswa2 = new Mahasiswa("244107060013", "Dedy Courbuzer");
        Mahasiswa mahasiswa3 = new Mahasiswa("244107060014", "Aloy");

        Reservasi reservasiLabTI = new Reservasi("26-09-2025", 2, labKomputer);

        reservasiLabTI.tambahMahasiswa(mahasiswa1);
        reservasiLabTI.tambahMahasiswa(mahasiswa2);
        reservasiLabTI.tambahMahasiswa(mahasiswa3);
        
        reservasiLabTI.tampilReservasi();
    }
}