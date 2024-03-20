import java.util.Scanner;

public class Tabung extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari; // update: penambahan jari_jari dan ;

    Tabung(String nameBangun) { // update: penambahan parameter double tinggi dan double jari_jari
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.luasPermukaan();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble(); // update: penambahan scanner.
        System.out.print("Input jari-jari: "); // update: penambahan ;
        jari_jari = scanner.nextDouble();
    }

    @Override // INFO : EQUATION SUDAH BENAR ??
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari);
        super.luasPermukaan(); // update: mengubah luasPermukaan menjadi luasPermukaan()
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override // INFO : EQUATION SUDAH BENAR ??
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi; // update: penambahan ;
        super.volume();
        System.out.println("Hasil volume: " + hasil); // update: penambahan +
    }
}