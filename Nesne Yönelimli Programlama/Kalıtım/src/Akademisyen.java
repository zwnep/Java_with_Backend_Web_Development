public class Akademisyen extends Calisan{
    //Eğer bir sınıf bir sınıfı extends ediyor ise yani kalıtım olarak alıyor ise,
    //ata sınıfın constructor'ını kendi içerisinde yazmak zorunda!!!

    //private tanımlanan değişken sadece kendi sınıfı içinde çağrılabilir.
    private String bolum;
    private String unvan;
    public Akademisyen(String adSoyad, String telefon, String ePosta, String bolum, String unvan){
        super(adSoyad,telefon,ePosta); //---> ata sınıfın constructor'ına erişmek için kullandığımız
                                       //bir anahtar kelimesidir.
        //super, sadece constructor'lar içerisinde kullanılır.
        //Bir constructor'un içerisinde super var ise
        // bu üst sınıfın constructor'unu referans aldığını söyler ve metodun parametrelerini
        //super() içine girilmesi gerekir.
        //Eğer içinde boş bir constructor var ise bütün bu yapılan işlemlere gerek yoktur.
        this.bolum = bolum;
        this.unvan = unvan;
        //En başta super olmak zorunda!!
    }

    public String getBolum() {
        return bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriş yaptı !!");
    }

}
