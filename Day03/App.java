package Day03;

import java.util.Scanner;

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

        Scanner s = new Scanner(System.in);

        System.out.println("=================");

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Panjang persegi panjang : ");
        double panjang = s.nextDouble();
        System.out.print("Lebar persegi panjang : ");
        double lebar = s.nextDouble();
        persegiPanjang.setSisi(panjang, lebar);
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
