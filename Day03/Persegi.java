package Day03;

public class Persegi extends BangunDatar {

    private int sisi;

    public Persegi() {
        
    }

    public Persegi(int sisi) {
        super();
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
        setHorizontal(sisi);
        setVertikal(sisi);
    }

    public void hitungLuas() {
        System.out.println("Luas Persegi : " + sisi * sisi);
    }

    public void hitungKeliling() {
        System.out.println("Keliling Persegi : " + 4 * sisi);
    }


}
