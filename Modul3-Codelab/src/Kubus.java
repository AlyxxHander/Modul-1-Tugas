import java.util.Scanner;
// INFO: TANYA APAKAH BENAR MEMANG SISI DAN BUKAN TINGGI (SEPERTI TYPO)
public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi; // PENDING update: mengubah sisi menjadi tinggi
    Kubus(String nameBangun) { // update: penambahan konstruktor Kubus
        super(nameBangun);
    }

    @Override
    public void inputNilai() { // update: mengubah input() menjadi inputNilai()
        super.inputNilai();
        System.out.print("Input tinggi: "); // update: melengkapi System.out.println
        tinggi = scanner.nextDouble(); // mengubah method nextNext menjadi nextDouble
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * tinggi * tinggi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil); // update: melengkapi sout
    }

    @Override
    public void volume() {
        double hasil = Math.pow(tinggi, 3); // update: penambahan double
        super.volume();
        System.out.println("Hasil volume: " + hasil + "\n");
    }
}
