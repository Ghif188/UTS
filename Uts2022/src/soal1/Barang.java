package soal1;

public class Barang {
    private int harga;
    private String nama;
    private char rank;
    private int quantity;
    public Barang(int harga, String nama, char rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return harga + " " + rank + " " + nama + " worth: " + quantity;
    }
}
