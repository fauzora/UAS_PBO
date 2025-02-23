//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

interface Kendaraan {
    void bergerak();
}

class Motor implements Kendaraan {
    public void bergerak() {
        System.out.println("Motor bergerak di jalan raya.");
    }
}

class Kapal implements Kendaraan {
    public void bergerak() {
        System.out.println("Kapal bergerak di atas air.");
    }
}

public class Interface {
    public void jalankan() {
        Kendaraan motor = new Motor();
        Kendaraan kapal = new Kapal();

        motor.bergerak();
        kapal.bergerak();
    }
}
