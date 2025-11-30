import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormRegistrasiGym {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Registrasi Member Gym");
        frame.setSize(420, 380);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label Nama
        JLabel lblNama = new JLabel("Nama Member:");
        lblNama.setBounds(20, 20, 120, 25);
        frame.add(lblNama);

        // Input Nama
        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 20, 230, 25);
        frame.add(txtNama);

        // Label Usia
        JLabel lblUsia = new JLabel("Usia:");
        lblUsia.setBounds(20, 60, 120, 25);
        frame.add(lblUsia);

        // Input Usia
        JTextField txtUsia = new JTextField();
        txtUsia.setBounds(150, 60, 230, 25);
        frame.add(txtUsia);

        // Label Paket
        JLabel lblPaket = new JLabel("Paket Gym:");
        lblPaket.setBounds(20, 100, 120, 25);
        frame.add(lblPaket);

        // Dropdown Paket (JComboBox)
        String[] paketGym = {"Bulanan", "3 Bulan", "Tahunan"};
        JComboBox<String> cbPaket = new JComboBox<>(paketGym);
        cbPaket.setBounds(150, 100, 230, 25);
        frame.add(cbPaket);

        // Tombol Simpan
        JButton btnSimpan = new JButton("Daftar Member");
        btnSimpan.setBounds(20, 150, 170, 30);
        frame.add(btnSimpan);

        // Tombol Reset
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(210, 150, 170, 30);
        frame.add(btnReset);

        // TextArea untuk hasil
        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 200, 360, 120);
        areaHasil.setEditable(false);
        frame.add(areaHasil);

        // EVENT SIMPAN KE MYSQL
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String usiaStr = txtUsia.getText().trim();
                String paket = cbPaket.getSelectedItem().toString();

                // Validasi input kosong
                if (nama.isEmpty() || usiaStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Nama dan usia wajib diisi!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validasi usia harus angka
                int usia;
                try {
                    usia = Integer.parseInt(usiaStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Usia harus berupa angka!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try (
                    // Koneksi ke MySQL (menggunakan try-with-resources agar koneksi tertutup otomatis)
                    Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5433/db_gym",
                        "postgres",
                        "iqo14july" // isi password jika ada
                    );
                    // Query insert
                    PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO member_gym (nama, usia, paket) VALUES (?, ?, ?)"
                    )
                ) {
                    stmt.setString(1, nama);
                    stmt.setInt(2, usia);
                    stmt.setString(3, paket);

                    stmt.executeUpdate();

                    // Tampilkan hasil
                    areaHasil.setText("REGISTRASI BERHASIL:\n");
                    areaHasil.append("Nama : " + nama + "\n");
                    areaHasil.append("Usia : " + usia + "\n");
                    areaHasil.append("Paket : " + paket + "\n");

                    JOptionPane.showMessageDialog(frame,
                            "Member gym berhasil didaftarkan!",
                            "Sukses",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Gagal menyimpan ke database!\n" + ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        // EVENT RESET FORM
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtUsia.setText("");
                cbPaket.setSelectedIndex(0);
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}