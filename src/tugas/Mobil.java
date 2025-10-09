package src.tugas;
class Mobil extends Kendaraan {
    // 2. Minimal 1 Atribut tambahan pada Child Class
    int jumlahPintu; 

    // 3. Constructor Overloading 1: Tanpa Parameter
    public Mobil() {
        // Panggilan 'super()' tanpa parameter terjadi secara implisit
        super();
        this.jumlahPintu = 4;
        // Mengubah nilai atribut parent setelah panggilan super()
        this.merek = "Mobil " + this.merek; 
        System.out.println("Mobil: Constructor tanpa parameter dipanggil.");
    }

    // 3. Constructor Overloading 2: Dengan Parameter. Memanggil super() berparameter
    public Mobil(String merek, int tahunProduksi, String warna, int jumlahPintu) {
        // Panggil constructor super() berparameter
        super(merek, tahunProduksi, warna); 
        this.jumlahPintu = jumlahPintu;
        System.out.println("Mobil: Constructor berparameter dipanggil.");
    }

    // 4. Method Overriding: Mengubah perilaku method dari Parent Class
    @Override
    public void tampilkanInfo() {
        // Memanggil method Parent Class untuk menampilkan info dasar
        // super.tampilkanInfo(); 
        
        System.out.println("--- Info Mobil (Child) ---");
        System.out.println("Merek: " + this.merek);
        System.out.println("Tahun Produksi: " + this.tahunProduksi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Jumlah Pintu: " + this.jumlahPintu + " pintu"); // Atribut tambahan
    }
}