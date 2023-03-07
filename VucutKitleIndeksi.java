import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy;
        double kilom;

        Scanner input = new Scanner (System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilom = input.nextDouble();

        double kindex = kilom / (boy * boy);

        System.out.print("Vücut Kitle indeksiniz: " +kindex) ;




    }
}
