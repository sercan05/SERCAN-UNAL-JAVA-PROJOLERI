import java.util.Scanner;

public class Proje_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindrom kelime.");
        } else {
            System.out.println(kelime + " bir palindrom kelime değil.");
        }

        scanner.close();
    }

    public static boolean isPalindrom(String kelime) {
        kelime = kelime.toLowerCase().replaceAll("\\s+", "");
        int uzunluk = kelime.length();

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
//SERCAN ÜNAL
