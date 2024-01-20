
public class Proje_12 {
    public static void main(String[] args) {
        String Yazı = "Programlama";
        int AtıcagıAdım = 12;

        for (int i = 0; i < AtıcagıAdım; i++) {
            String kaydirilmis = Yazı.substring(i) + Yazı.substring(0, i);
            System.out.println(" - " + kaydirilmis);
        }
    }
}
//  'Sercan ÜNAL '