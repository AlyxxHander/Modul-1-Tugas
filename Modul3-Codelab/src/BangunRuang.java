public class BangunRuang {
    private String name;

    BangunRuang(String name) { // update: namee menjadi name
        this.name = name;
    }
    public void inputNilai() {
        System.out.println("Input nilai");
    }
    public void luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun " + getName()); // update: penambahan + dan getter name
    }
    public void volume() {
        System.out.println("Menghitung volume bangun " + getName()); // update: penambahan ; dan getter name
    }
    public void setName(String name) { // update: mengubah string menjadi String
        this.name = name;
    }
    public String getName() {
        return name; // update: mengubah your menjadi name dan penambahan ;
    }
}
