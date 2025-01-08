// Inheritance

package Day03;

public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        
    }

    public Segitiga(double alas, double tinggi, double sisi) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
        setHorizontal(alas);
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
        setVertikal(tinggi);
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga : " + luas);
    }

    public void hitungKeliling() {
        double keliling = 3 * sisi;
        System.out.println("Keliling segitiga : " + keliling);
    }

    
    
}
