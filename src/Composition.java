//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

class Mesin {
    String tipe;

    Mesin(String tipe) {
        this.tipe = tipe;
    }
}

class Mobil {
    private Mesin mesin;

    Mobil(String tipeMesin) {
        this.mesin = new Mesin(tipeMesin);
    }

    void tampilkan() {
        System.out.println("Mobil dengan mesin: " + mesin.tipe);
    }
}

public class Composition {
    public void jalankan() {
        Mobil mobil = new Mobil("V8");
        mobil.tampilkan();
    }
}
