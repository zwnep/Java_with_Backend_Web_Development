public class Kitap {
    private String kitapAdi, yazar;
    private int sayfaSayisi;
    /*
      Sınıfa ait değişkenlerimin izinlerini private yaparak bu sorunu çözdük ama,
      biz book nesnesine ait değişkenlere erişimi tamamen kısıtladık.
      Yani biz oluşturduğumuz nesneye ait sayfa sayısını ekrana bastıramayız çünkü değişken private olarak tanımlandı.
      Ya da sayfa sayısı yanlış girilmiş bir nesneyi daha sonrasında düzenleyemeyiz.
      Bu sorunu çözmek için sınıfa ait değişkenlerimizi sarmalayarak,
      sınıf içerisinde ki metotlar yardımı ile değişkenlerimizi koruma altına alıyoruz ve kullanıma sunuyoruz.
       */


    //constructor(kurucu)
     Kitap(String kitapAdi, int sayfaSayisi, String yazar){
         this.kitapAdi = kitapAdi;

         if(sayfaSayisi < 0){
             this.sayfaSayisi = 10;
         }
         this.yazar = yazar;
    }
    /*
    Constructor metodu görüldüğü gibi modifiye ettik ve nesne oluşturulurken anlamız verilerin olmasını engelledik.
    Ama sorunlarımız hala bitmedi , biz nesneye ait niteliklere hala dışarıdan erişebiliyoruz ve book.sayfaSayisi = -10 dersek,
    nesneye ait sayfa sayısını yine anlamsızlaştırmış oluruz.
    Bu sorunu çözmek için sınıfa ait değişkenlere dışarıdan erişimi kapatmamız gerekir ve
    oluşturduğumuz değişkenlerin erişim belirleyicilerini (Access Modifiers) değiştirmemiz gerekli.
    Tüm public'leri private olarak değiştiriyoruz.
     */

    //get getirme - set değiştirme

    public int getSayfaSayisi(){
        return this.sayfaSayisi;
    }
    //Görüldüğü gibi basit bir metot yardımı ile sınıfa ait private değişkenimize ulaşabildik.
    //İsimlendirilmesini get ile başlayıp sonra değişken ismi yazılmalıdır.
    // İsimlendirmeyi bu şekilde yapmasak da çalışacaktır lakin kodun okunabilirliği adına bu kurala uyulması gerekir.

    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi = sayfaSayisi;
    }
    //Görüldüğü üzere setter metodu sadece değiştirme işlemi yapacağı için void olarak tanımlandı ve bir adet parametre aldı.
    // Bu parametre bizim yeni değerimi taşıyor olup, sınıfa ait değişkene aktarılmıştır.
    // Ama burada hala bir sorun söz konusudur,
    // bizler setter metodunu kullanarak sayfa sayısını negatif girebiliriz.
    // Bu sorunu aşmak için constructor (kurucu) metotta yaptığımız gibi bir if koşulu ile bu sorunu çözebiliriz.
/*
    public void setSayfaSayisi(int sayfaSayisi){
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
 */

    



}
