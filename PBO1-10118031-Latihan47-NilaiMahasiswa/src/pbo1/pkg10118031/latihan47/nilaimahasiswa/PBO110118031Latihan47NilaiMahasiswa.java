package pbo1.pkg10118031.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai mahasiswa
 */
public class PBO110118031Latihan47NilaiMahasiswa {

    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);

        Nilai nilai = new Nilai();
        nilai.getNA();

        System.out.print("Quiz\t = ");
        nilai.setQuiz(scn1.nextDouble());
        System.out.print("UTS\t = ");
        nilai.setUTS(scn2.nextDouble());
        System.out.print("UAS\t = ");
        nilai.setUAS(scn3.nextDouble());

        System.out.println("\nNilai Akhir " + nilai.nilaiAkhir());
        System.out.println("\nIndeks = " + nilai.Indeks());
        System.out.println("Keterangan = " + nilai.aturanKeterangan());

    }

}
