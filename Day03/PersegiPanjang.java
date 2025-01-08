package Day03;

public class PersegiPanjang extends BangunDatar {
    
    private double panjang;
    private double lebar;

    public PersegiPanjang() {
        
    }

    public PersegiPanjang(double panjang, double lebar) {
        super();
    }

    public void setSisi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        setHorizontal(panjang);
        setVertikal(panjang);
    }

    public void hitungLuas(){
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang : " + luas);
    }

    public void hitungKeliling(){
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang : " + keliling);
    }

}
