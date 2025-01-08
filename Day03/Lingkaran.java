package Day03;

public class Lingkaran extends BangunDatar {

    private double jariJari;
    
    public Lingkaran() {
        
    }

    public Lingkaran(int jariJari) {
        super();
        setJariJari(jariJari);
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuas() {
        double luas = Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas lingkaran : " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran : " + keliling);
    }

}
