import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        // Değişkenleri Tanımla
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner import
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Veri Almak
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        System.out.println("Ortalamanız : " + ortalama);
        boolean baraj = ortalama >= 60;
        String sonuc = baraj ? "SINIFI GEÇTİ" : "SINIFTA KALDI";
        System.out.print("Sonuç: " + sonuc);







    }
}
