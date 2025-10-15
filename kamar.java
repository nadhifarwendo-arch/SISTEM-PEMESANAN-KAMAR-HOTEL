public class kamar {
   private int nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private boolean status;

    public kamar(int nomorKamar, String tipeKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = false;
    }

    public void pesanKamar() {
        status = true;
    }

    public void kosongkanKamar() {
        status = false;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Kamar " + nomorKamar + " (" + tipeKamar + ") - Rp" + hargaPerMalam +
               " per malam - " + (status ? "Sudah Dipesan" : "Kosong");

              
    } 
}
