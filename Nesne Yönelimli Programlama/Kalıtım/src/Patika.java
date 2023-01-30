public class Patika {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Zeynep Açıkgöz", "888", "zwnepd");
        Akademisyen a1 = new Akademisyen("Eray Açıkgöz","777","eakzz1907","VET","hekim");

        //Bir sınıf yalnızca bir sınıftan kalıtım yapabilir, bu Java için geçerl.

        ogretimGörevlisi o1 = new ogretimGörevlisi("Hüseyin Demirtaş", "555", "hdmrts","ENG", "OGRT", "68");
        o1.giris();;
        o1.derseGir();

    }
}
