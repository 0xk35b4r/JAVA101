import java.util.Scanner;
public class KDVHesaplayanProgram {
    public static void main(String[] args) {

        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen tutar giriniz : ");
        tutar = input.nextDouble();

        // KDV Hesaplama
        boolean kosul = tutar >= 1000;
        double kdvOrani = kosul ? 0.18 : 0.08;
        double kdvlitutar = (tutar * kdvOrani) + tutar;

        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV'li tutar : " + kdvlitutar);






    }
}
