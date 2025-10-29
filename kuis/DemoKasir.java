public class DemoKasir {
    public static void main(String[] args) {
        Produk nasiPadang = new Produk("P001", "Nasi Padang", 15000);
        Produk esTeh = new Produk("P002", "Es Teh", 5000);
        Produk esMilo = new Produk("P003", "esMilo", 7000);

        Transaksi transaksiBaru = new Transaksi();

        transaksiBaru.tambahItem(nasiPadang, 2);
        transaksiBaru.tambahItem(esTeh, 3);
        transaksiBaru.tambahItem(esMilo, 1);

        transaksiBaru.tampilNota();
    }
}