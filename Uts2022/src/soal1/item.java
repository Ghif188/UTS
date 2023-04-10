package soal1;

public class item {
    private int size = 3;
    private int index = 0;
    private Barang [] allItem = new Barang[size];

    public item(int harga, String nama, char rank, int quantity) {
        Barang item = new Barang(harga, nama, rank, quantity);
        if (index < size) {
            allItem[index] = item;
            index += 1;
        } else {
            System.out.println("Barang Penuh");
        }
    }

    public int getIndex() {
        return index;
    }

    public static void seeAllItem() {
        for (int i = 0; i < size; i++) {
            allItem[i].toString();
        }
    }
}
