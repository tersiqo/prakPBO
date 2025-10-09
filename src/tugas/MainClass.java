package src.tugas;
public class MainClass {
    public static void main(String[] args) {
        // 5. Instansiasi objek child class
        
        System.out.println("=== Instansiasi Objek Mobil dengan Constructor Berparameter ===");
        Mobil mobilSport = new Mobil("Ferrari", 2024, "Merah", 2);
        
        System.out.println("\n--- Print Info Objek mobilSport ---");
        // Print info nya (method yang sudah di-override)
        mobilSport.tampilkanInfo(); 

        System.out.println("\n" + "=".repeat(60) + "\n");
        
        System.out.println("=== Instansiasi Objek Mobil dengan Constructor Tanpa Parameter ===");
        Mobil mobilStandar = new Mobil();
        
        System.out.println("\n--- Print Info Objek mobilStandar ---");
        // Print info nya (method yang sudah di-override)
        mobilStandar.tampilkanInfo(); 
    }
} 
    

