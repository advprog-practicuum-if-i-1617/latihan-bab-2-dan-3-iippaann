package bab.pkg3.overload;
import java.util.Scanner;
public class Overload {
    public static String convert(int bil) {
        String[] angka = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String hasil = " ";
        if (bil < 12) {
            hasil = " " + angka[bil];
        } else if (bil < 20) {
            hasil = (bil - 10) + " belas";
        } else if (bil < 100) {
            hasil = convert(bil / 10) + " puluh" + convert(bil % 10);
        } else if (bil < 200) {
            hasil = "seratus " + convert (bil-100);
        } else if (bil < 1000) {
            hasil = convert (bil/100) + " ratus " + convert (bil%100);
        } else if (bil == 1000) {
            hasil = "seribu";
        } else {
            hasil = "angka salah";
        }
        return hasil;
    }
    static String convert(String bilangan) {
        String uji[] = new String[4];
        if (bilangan.equalsIgnoreCase(" ")) return " ";
        else if (bilangan.equalsIgnoreCase("nol")) return "0";
        else if (bilangan.equalsIgnoreCase("satu")) return "1";
        else if (bilangan.equalsIgnoreCase("dua")) return "2";
        else if (bilangan.equalsIgnoreCase("tiga")) return "3";
        else if (bilangan.equalsIgnoreCase("empat")) return "4";
        else if (bilangan.equalsIgnoreCase("lima")) return "5";
        else if (bilangan.equalsIgnoreCase("enam")) return "6";
        else if (bilangan.equalsIgnoreCase("tujuh")) return "7";
        else if (bilangan.equalsIgnoreCase("delapan")) return "8";
        else if (bilangan.equalsIgnoreCase("sembilan")) return "9";
        else if (bilangan.equalsIgnoreCase("sepuluh")) return "10";
        else if (bilangan.equalsIgnoreCase("sebelas")) return "11";
        else if (bilangan.equalsIgnoreCase("seratus")) return "100";
        else if (bilangan.equalsIgnoreCase("seribu")) return "1000";
        else{ 
            uji = bilangan.split(" ");
            if (uji.length == 2){
                if (uji[1].equalsIgnoreCase("belas")) return 1 + convert(uji[0]);
                if (uji[1].equalsIgnoreCase("puluh")) return convert(uji[0]) + "0";
            }
            else if (uji.length == 4){
                if (uji[1].equalsIgnoreCase("ratus")) return convert(uji[0]) + "00";
                if (uji[3].equalsIgnoreCase("puluh")) return convert(uji[2]) + "0";
            }
            else return convert(uji[0]) + convert(uji[2]) + convert(uji[4]);
        }
        return " ";
    }
        
    public static void main(String[] args) {
        System.out.println("=====================================================================");
        System.out.println("   Konversi Angka ke Terbilang dan Sebaliknya Dengan Range 1-1000");
        System.out.println("=====================================================================");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan bilangan (dalam huruf) : ");
        String huruf = input.nextLine();
        System.out.println(convert(huruf));
        System.out.print("Masukkan bilangan (dalam angka) : ");
        int bil = input.nextInt();
        System.out.println(convert(bil));   
   }
}
