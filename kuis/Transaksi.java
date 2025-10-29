import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;
    private double totalHarga;

    public Transaksi() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        this.tanggal = formatter.format(new Date());
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi item = new ItemTransaksi(p, jumlah);
        daftarItem.add(item);
        hitungTotal();
    }

    public void hitungTotal() {
        this.totalHarga = 0.0;
        for (ItemTransaksi item : daftarItem) {
            this.totalHarga += item.hitungSubtotal();
        }
    }

    public void tampilNota() {
        System.out.println("-------------------------------------");
        System.out.println("             KANTIN KAMPUS           ");
        System.out.println("-------------------------------------");
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("-------------------------------------");
        System.out.printf("%-15s %-5s %10s\n", "Nama Produk", "Qty", "Subtotal");
        System.out.println("-------------------------------------");

        for (ItemTransaksi item : daftarItem) {
            Produk produk = item.getProduk();
            System.out.printf("%-15s %-5d %10.2f\n",
                    produk.getNamaProduk(),
                    item.getJumlah(),
                    item.hitungSubtotal());
        }

        System.out.println("-------------------------------------");
        System.out.printf("%-22s %10.2f\n", "TOTAL", this.totalHarga);
        System.out.println("-------------------------------------");
    }

    public String getTanggal() { return tanggal; }
    public ArrayList<ItemTransaksi> getDaftarItem() { return daftarItem; }
    public double getTotalHarga() { return totalHarga; }
}