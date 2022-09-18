package Kasus_1;

public class Barang {

    // Atribut Barang
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    // Setter
    public void  addStok(int newStok){
        stok += newStok;
    }
    
    // Getter
    public int getStok(){
        return stok;
    }
    
    // Print Out sebuah Inventori Object
    public void showInventori(){
        System.out.println("Kode Barang : " + kode_barang);
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Stok Barang : " + stok);
    }
}



