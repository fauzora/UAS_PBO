//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

class Laptop {
    String merk;

    Laptop(String merk) {
        this.merk = merk;
    }
}

class Mahasiswa {
    String nama;
    Laptop laptop;

    Mahasiswa(String nama, Laptop laptop) {
        this.nama = nama;
        this.laptop = laptop;
    }

    void tampilkan() {
        System.out.println(nama + " menggunakan laptop " + laptop.merk);
    }
}

public class Aggregation {
    public void jalankan() {
        Laptop l = new Laptop("Asus");
        Mahasiswa m = new Mahasiswa("Ariel", l);
        m.tampilkan();
    }
}
