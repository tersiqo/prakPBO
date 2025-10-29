public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;
    private String status;

    public Ruangan(String kodeRuangan, String namaRuangan, int kapasitas, String status) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    public String getKodeRuangan() {
        return this.kodeRuangan;
    }

    public String getNamaRuangan() {
        return this.namaRuangan;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public String getStatus() {
        return this.status;
    }
}