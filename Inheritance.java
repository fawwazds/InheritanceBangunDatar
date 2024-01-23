package inheritance;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        System.out.println("Masukkan Sisi Persegi :");
        persegi.sisi = input.nextInt();
       

        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Masukkan Sisi Lingkaran :");
        lingkaran.r = input.nextInt();
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = input.nextInt();
        System.out.println("Masukkan Panjang PersegiPanjang :");
        persegiPanjang.lebar = input.nextInt();
        System.out.println("Masukkan Lebar PersegiPanjang :");
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = input.nextInt();
        System.out.println("Masukkan Alas Segitiga :");
        mSegitiga.tinggi = input.nextInt();
        System.out.println("Masukkan Tinggi Segitiga :");

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
