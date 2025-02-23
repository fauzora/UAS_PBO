//Nama: Chairil Fauzi Firmansyah
//NIM: 230401010024
//Kelas; IF503
//Nama Mata Kuliah: Pemrograman Berorientasi Objek

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAggregation: ");
        Aggregation aggregation = new Aggregation();
        aggregation.jalankan();

        System.out.println("\nAssociation: ");
        Association association = new Association();
        association.jalankan();

        System.out.println("\nComposition: ");
        Composition composition = new Composition();
        composition.jalankan();

        System.out.println("\nInterface: ");
        Interface interfaceExample = new Interface();
        interfaceExample.jalankan();
    }
}
