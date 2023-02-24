import java.util.Scanner;
public class KDVHesaplayanProgram {
    public static void main(String[] args) {

        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen tutar giriniz : ");
        tutar = input.nextDouble();

        // KDV Hesaplama
        double KDVTutari = tutar * 0.18;
        System.out.println("KDV Tutarı : " + KDVTutari);
        double VergiliTutar = tutar + KDVTutari;
        System.out.println("Vergili Tutar : " + VergiliTutar);

    }
}
