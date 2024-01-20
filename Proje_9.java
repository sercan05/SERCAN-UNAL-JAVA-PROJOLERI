import java.util.Scanner;
public class Proje_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("onluk bir sayı giriniz: ");
        int onluk = scanner.nextInt();


        String negativeBinaryFormat = convertToNegativeBinary(onluk);


        System.out.println("onluk: " + onluk);
        System.out.println("2 (binary): " + negativeBinaryFormat);

        scanner.close();
    }

    public static String convertToNegativeBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder negativeBinaryStringBuilder = new StringBuilder();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % -2;
            decimalNumber /= -2;

            if (remainder < 0) {
                remainder += 2;
                decimalNumber += 1;
            }

            negativeBinaryStringBuilder.insert(0, remainder);
        }

        return negativeBinaryStringBuilder.toString();
    }
}
//SERCAN ÜNAL