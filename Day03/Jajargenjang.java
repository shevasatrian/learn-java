package Day03;

public class Jajargenjang extends AbstractBangunDatar {
    
    private double alas, tinggi, sisiMiring;

    public Jajargenjang(double alas, double tinggi, double sisiMiring) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Luas Jajargenjang : " + alas * tinggi);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Keliling Jajargenjang : " + 2 * (alas + sisiMiring));
    }

}
