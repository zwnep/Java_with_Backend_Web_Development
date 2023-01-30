public class Main {
    public static void main(String[] args) {
        /*
        Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir.
        Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

        Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir.
        Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz.
         */

        Kitap book = new Kitap("Harry Potter",500,"JK Rowling");
        //Kitap sınıfından book adlı bir nesne oluşturduk ve bu nesnemizin niteliklerini belirttik.
        //Peki biz bu kurucu metotta sayfa sayısını negatif bir değer girseydik ne olurdu ?
        // Hiç bir kitabın sayfa sayısı negatif bir değer olamayacağı için, nesnemizde bir anlamsızlık olacaktı.
        // Biz bu sorunu constructor (kurucu) metotumuza yazacağımız bir if kontrolü ile çözebiliriz.


    }
}