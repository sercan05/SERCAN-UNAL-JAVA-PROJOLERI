import java.util.Scanner;
public class Proje_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir kelime giriniz lütfen: ");
        String kelime = scanner.nextLine().toLowerCase();


        int sesliHarfSayisi = sesliHarfSayisiBul(kelime);
        int sessizHarfSayisi = kelime.length() - sesliHarfSayisi;


        System.out.println("Sesli harf sayısı bu kadar: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı bu kadar: " + sessizHarfSayisi);

        scanner.close();
    }


    public static int sesliHarfSayisiBul(String kelime) {
        int sesliHarfSayisi = 0;
        String sesliHarfler = "aeiou";

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);

            if (sesliHarfler.indexOf(harf) != -1) {
                sesliHarfSayisi++;
            }
        }

        return sesliHarfSayisi;
    }
}
//SERCAN ÜNAL 