//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

class Siswa {
    String nama;

    Siswa(String nama) {
        this.nama = nama;
    }

    void tampilkanDosen(Dosen d) {
        System.out.println(nama + " dibimbing oleh " + d.nama);
    }
}

public class Association {
    public void jalankan() {
        Siswa siswa = new Siswa("Anton");
        Dosen dosen = new Dosen("Pak Budi");
        siswa.tampilkanDosen(dosen);
    }
}
