package src.tugas;

class Kendaraan {
    // 2. Tiga Atribut pada Parent Class
    String merek;
    int tahunProduksi;
    String warna;

    // 3. Constructor Overloading 1: Tanpa Parameter
    public Kendaraan() {
        this.merek = "Tidak Diketahui";
        this.tahunProduksi = 2000;
        this.warna = "Hitam";
        System.out.println("Kendaraan: Constructor tanpa parameter dipanggil.");
    }

    // 3. Constructor Overloading 2: Dengan Parameter
    public Kendaraan(String merek, int tahunProduksi, String warna) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        System.out.println("Kendaraan: Constructor berparameter dipanggil.");
    }

    // 4. Method Overriding: Method yang akan di-override
    public void tampilkanInfo() {
        System.out.println("--- Info Kendaraan (Parent) ---");
        System.out.println("Merek: " + this.merek);
        System.out.println("Tahun Produksi: " + this.tahunProduksi);
        System.out.println("Warna: " + this.warna);
    }
}
