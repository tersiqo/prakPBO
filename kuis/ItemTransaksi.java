public class ItemTransaksi {
    private Produk produk;
    private int jumlah;

    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return this.produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }
}