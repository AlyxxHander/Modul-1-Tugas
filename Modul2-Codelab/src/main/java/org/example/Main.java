package org.example;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Keluar");
    }

    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[100];
        int jumlahMahasiswa = 0;
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nMasukkan data mahasiswa:");
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    String nim;
                    do {
                        System.out.print("NIM (panjang harus 15 angka): ");
                        nim = scanner.nextLine();
                    } while (nim.length() != 15);
                    System.out.print("Jurusan: ");
                    String jurusan = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                    daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
                    jumlahMahasiswa++;
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nData Mahasiswa:");
                    System.out.println(Mahasiswa.tampilUniversitas());
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.println(daftarMahasiswa[i].tampilDataMahasiswa());
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Pilihan tidak valid ! Silahkan pilih lagi ...");
                    break;
            }
        } while (pilihan != 3);
    }
}

