package org.example;

import java.util.Scanner;
import java.time.*;

// NOTE: Intellij need to be connected to github through git

public class Codelab1 {
    static String inputedName;
    static String gender;
    static String formatedDate;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("// Input");
        System.out.print("Nama : ");
        inputedName = scanner.nextLine();
        System.out.print("jenis Kelamin (L/P) : ");
        String genderChoice = scanner.nextLine().toUpperCase();
        if(!(genderChoice.equals("L") || genderChoice.equals("P"))) {
            System.out.println("Pilihan tidak sesuai ! Keluar program ...");
            scanner.close();
            return;
        }
        gender = genderChoice.equals("L") ? "Laki-laki" : "Perempuan"; // Ternary operator
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        formatedDate = scanner.nextLine();
        String[] splitParts = formatedDate.split("-"); // read and store the int value with "-" as separator/delimiter
        if (splitParts.length != 3) {
            System.out.println("Format tanggal salah! Harap masukkan dengan format yang benar (yyyy-mm-dd).");
            scanner.close();
            return;
        }
        scanner.close();

        output();
    }

    public static Period dateCalculation () {
        LocalDate localDate = LocalDate.now();
        LocalDate startingDate = LocalDate.parse(formatedDate);
        Period period = Period.between(startingDate, localDate);

        return period;
    }
    
    static void output() {
        System.out.println("\n// Output");
        System.out.println("Nama : " + inputedName);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Umur anda : " + dateCalculation().getYears() + " Tahun, " + dateCalculation().getMonths() + " Bulan, " + dateCalculation().getDays() + " hari");
    }

    public static void main(String[] args) {
        input();
    }
}
