import java.util.ArrayList;

public class Hotel {
    private ArrayList<kamar> daftarKamar;

    public Hotel() {
        daftarKamar = new ArrayList<>();
    }

    public void tambahKamar(kamar k) {
        daftarKamar.add(k);
    }

    public kamar cariKamarKosong(String tipe) {
        for (kamar k : daftarKamar) {
            if (k.getTipeKamar().equalsIgnoreCase(tipe) && !k.isStatus()) {
                return k;
            }
        }
        return null; 
    }

    public double hitungTotalBayar(Tamu t, kamar k) {
        return t.getDurasiMenginap() * k.getHargaPerMalam();
    }

    public void tampilkanDaftarKamar() {
        System.out.println("\n=== DAFTAR KAMAR HOTEL ===");
        for (kamar k : daftarKamar) {
            System.out.println(k);
        }
    }
}
