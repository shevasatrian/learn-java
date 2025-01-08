package Day03;

public class PersegiPanjang extends BangunDatar {
    
    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        
    }

    public PersegiPanjang(int panjang, int lebar) {
        super();
    }

    public void setSisi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        setHorizontal(panjang);
        setVertikal(panjang);
    }

    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang : " + luas);
    }

    public void hitungKeliling(){
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang : " + keliling);
    }

}
