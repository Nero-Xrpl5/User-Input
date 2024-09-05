import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        //1. NIP
        //2. NAMA
        //3. MAPEL
        //4. STATUS

        // Kelas Guru

        Scanner s = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = s.nextLine();
        System.out.println("Mapel :");
        String mapel = s.nextLine();
        System.out.println("Status :");
        String status = s.nextLine();
        System.out.println("NIP :");
        int nip = s.nextInt();

        s.close();

        Guru BuPasha = new Guru(nip, nama, mapel,status);
        BuPasha.print();

        // Guru Rabani = new Guru(111, "Rabani", "Ekonomi", "Tetap");
        // Rabani.print();
        // System.out.println( );

        // Guru Nafis = new Guru(112, "Nafis", "Agama", "Tetap");
        // Nafis.print();
        // System.out.println( );

        // Guru Reyhan = new Guru(113, "Reyhan", "Pengembangan Game", "Tetap");
        // Reyhan.print();
        // System.out.println( );

        // Guru Itoo = new Guru(114, "Itoo", "Filosofi", "Tetap");
        // Itoo.print();
        // System.out.println( );

        // Guru Iqbal = new Guru(115, "Iqbal", "Informatika", "Shift");
        // Iqbal.print();
        // System.out.println( );


        // Guru pasha = new Guru(101, "Pasha", "RPL", "Tetap");
        // pasha.setNama("Bu Pasha");
        // pasha.setMapel("RPL");
        // pasha.setStatus("Tetap");
        // pasha.setNip(101);
        // pasha.print();
        



        
    
    }

    
    
}
