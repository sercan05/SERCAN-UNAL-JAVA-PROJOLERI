public class Proje_19{
        private String isim;
        private String renk;
        private String sahiplik;
    private Proje_19(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }
        private void setPazaryeriBilgileri(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }
        private void setIsimRenk(String isim, String renk) {
            this.isim = isim;
            this.renk = renk;
        }
        private String getIsim() {
            return this.isim;
        }
        private String getRenk() {
            return this.renk;
        }
        private String getSahiplik() {
            return this.sahiplik;
        }
        public String PazaryeriTuru() {
            return "belirsiz";
        }
        public static void main(String[] args) {
            Proje_19 pazaryeri = new Proje_19("Örnek Pazar", "Mavi", "Yerli");

            System.out.println("İsim: " + pazaryeri.getIsim());
            System.out.println("Renk: " + pazaryeri.getRenk());
            System.out.println("Sahiplik: " + pazaryeri.getSahiplik());

            pazaryeri.setPazaryeriBilgileri("Yeni Pazar", "Yeşil", "Yabancı");

            System.out.println("\nGüncellenmiş Yeni Bilgiler:");
            System.out.println("İsim: " + pazaryeri.getIsim());
            System.out.println("Renk: " + pazaryeri.getRenk());
            System.out.println("Sahiplik: " + pazaryeri.getSahiplik());

            pazaryeri.setIsimRenk("Başka Pazar", "Kırmızı");

            System.out.println("\nİsim ve Renk Güncellendi:");
            System.out.println("İsim: " + pazaryeri.getIsim());
            System.out.println("Renk: " + pazaryeri.getRenk());
            System.out.println("\nPazaryeri Türü: " + pazaryeri.PazaryeriTuru());
        }
    }

