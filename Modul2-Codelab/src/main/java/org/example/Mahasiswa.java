package org.example;
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String tampilDataMahasiswa() {
        String displayNama = "Nama: " + nama;
        String displayNIM = ", NIM: " + nim;
        String displayJurusan = ", Jurusan: " + jurusan;
        return displayNama + displayNIM + displayJurusan;
    }

    public static String tampilUniversitas() {
        return "Universitas Muhammadiyah Malang";
    }
}