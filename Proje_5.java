import java.util.Scanner;
public class Proje_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("5 basamaklı pozitif bir sayı giriniz lütfen: ");
        int sayi = scanner.nextInt();

        if (sayi >= 10000 && sayi <= 99999) {

            int birler = sayi % 10;
            int onlar = (sayi / 10) % 10;
            int yuzler = (sayi / 100) % 10;
            int binler = (sayi / 1000) % 10;
            int onBinler = (sayi / 10000) % 10;

            System.out.println("On Binler Basamağı: " + onBinler);
            System.out.println("Binler Basamağı: " + binler);
            System.out.println("Yüzler Basamağı: " + yuzler);
            System.out.println("Onlar Basamağı: " + onlar);
            System.out.println("Birler Basamağı: " + birler);
        } else {
            System.out.println("Girilen sayı 5 basamaklı malesef değil!");
        }
        scanner.close();
    }
}
//SERCAN ÜNAL
