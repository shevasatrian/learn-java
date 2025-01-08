package Day03;

public class BangunDatar {

    private String nama;
    private double horizontal;
    private double vertikal;
    private double diagonal;
    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHorizontal() {
        return horizontal;
    }
    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }
    public double getVertikal() {
        return vertikal;
    }
    public void setVertikal(double vertikal) {
        this.vertikal = vertikal;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void hitungLuas() {
        System.out.println("Menghitung luas...");
    }

    public void hitungKeliling() {
        System.out.println("Menghitung keliling...");
    }
    
}
