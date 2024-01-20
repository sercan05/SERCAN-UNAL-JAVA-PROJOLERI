import java.util.Scanner;
public class Proje_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayiAdedi=10;
        int buyukToplam=0;
        int kucukToplam=0;

        for (int i =0; i < sayiAdedi; i++) {
            System.out.println("Bir Sayı Giriniz (0-100 Arası):");
            int sayi = scanner.nextInt();

            if (sayi >= 50) {
                buyukToplam += sayi;
            } else {
                kucukToplam += sayi;
            }
        }
        if (kucukToplam !=0) {
            double oran = (double) buyukToplam / kucukToplam;
            System.out.println("50 ve üstü sayıların toplamı /50 'den küçük sayıların toplamı oranı: \" + oran);");
        }else{
            System.out.println("50'den küçük sayıların toplamı sıfır olduğu için oran hesaplanamıyor.\"");
        }
        scanner.close();
    }
}
//SERCAN ÜNAL
