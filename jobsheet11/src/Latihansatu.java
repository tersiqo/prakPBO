package src;
import javax.swing.JFrame;

public class Latihansatu {
    public static void main(String[] args) {

        // Membuat objek JFrame
        JFrame frame = new JFrame("Latihan Saya");

        // Mengatur ukuran jendela
        frame.setSize(600, 400);

        // Menutup aplikasi ketika jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan jendela
        frame.setVisible(true);

    }
}