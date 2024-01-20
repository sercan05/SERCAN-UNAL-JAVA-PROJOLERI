import java.util.Random;
import java.util.Scanner;
public class Proje_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Taş,Kağıt , Makas Oyununa Hoşgeldiniz");
        System.out.println("Hamlenizi Seçin (Taş, Kağıt,Makas):");
        String oyuncuHamlesi = scanner.nextLine();
        if ("Taş".equals(oyuncuHamlesi) || "Kağıt".equals(oyuncuHamlesi) || "Makas".equals(oyuncuHamlesi)) {
            int bilgisayarSecimi = random.nextInt(3); // 0, 1, 2
            String[] secenekler = {"Taş", "Kağıt", "Makas"};
            String bilgisayarHamlesi = secenekler[bilgisayarSecimi];
            System.out.println("Bilgisayarın hamlesi: " + bilgisayarHamlesi);

            if (oyuncuHamlesi.equals(bilgisayarHamlesi)) {

                System.out.println("Berabere!");
            } else if ((oyuncuHamlesi.equals("Taş") && bilgisayarHamlesi.equals("Makas")) ||
                    (oyuncuHamlesi.equals("Kağıt") && bilgisayarHamlesi.equals("Taş")) ||
                    (oyuncuHamlesi.equals("Makas") && bilgisayarHamlesi.equals("Kağıt"))) {
                System.out.println("Kazandınız!");
            } else {
                System.out.println("Bilgisayar kazandı!");
            }
        } else {
            System.out.println("Geçersiz hamle! Lütfen Taş, Kağıt veya Makas seçin.");
        }
        scanner.close();


    }
}
//SERCAN ÜNAL



