package Day03;

public class App {

    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.setNama("Persegi");
        bangunDatar.setHorizontal(4);
        bangunDatar.setVertikal(4);

        bangunDatar.hitungLuas();
        bangunDatar.hitungKeliling();

        System.out.println("=================");

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        System.out.println("=================");

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setSisi(5, 6);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();

        System.out.println("=================");

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        System.out.println("=================");

        Segitiga segitiga = new Segitiga(4, 5, 6);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();

        System.out.println("=================");

        AbstractBangunDatar jajargenjang = new Jajargenjang(5, 7, 4);
        jajargenjang.hitungLuas();
        jajargenjang.hitungKeliling();

        
    }
    
}
