import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.tambahKamar(new kamar(101, "Standar", 300000));
        hotel.tambahKamar(new kamar(102, "Deluxe", 500000));
        hotel.tambahKamar(new kamar(103, "Suite", 800000));
        hotel.tambahKamar(new kamar(104, "Standar", 300000));

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("\nMasukkan nama tamu: ");
            String nama = input.nextLine();

            System.out.print("Masukkan durasi menginap (malam): ");
            int durasi = Integer.parseInt(input.nextLine());

            System.out.print("Masukkan tipe kamar yang diinginkan (Standar/Deluxe/Suite): ");
            String tipe = input.nextLine();

            Tamu tamu = new Tamu(nama, durasi);
            kamar kamar = hotel.cariKamarKosong(tipe);

            if (kamar != null) {
                kamar.pesanKamar();
                double total = hotel.hitungTotalBayar(tamu, kamar);
                System.out.println("✅ Kamar " + kamar.getNomorKamar() + " berhasil dipesan untuk " + tamu.getNama());
                System.out.println("Total biaya: Rp" + total);
            } else {
                System.out.println("❌ Tidak ada kamar kosong untuk tipe " + tipe);
            }
        }

        hotel.tampilkanDaftarKamar();
        input.close();
    }
}

