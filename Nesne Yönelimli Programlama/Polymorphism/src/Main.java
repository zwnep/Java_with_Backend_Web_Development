public class Main {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args) {
        /*
        Çok Biçimlilik (Polymorphism)


        Çok biçimlilik aynı görevin veya işin farklı yollarla yapılabilmesini ifade eder. Nesne, aynı davranışı farklı formlar ve görünüşler ile yerine getirebilir.

        Bunu yapabilmek için iki yöntem vardır.
        1.Overriding in Java (Ezme)
        2.Overloading in Java (Aşırı yükleme)
         */
        //ÖRNEK:

        // İlk Gösterim
        Hayvan hayvan = new Hayvan("Hiper");
        System.out.println(hayvan.konus());
        Hayvan hayvan1 = new Kedi("Hiper");
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new Kopek("Hiper");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new At("Hiper");
        System.out.println(hayvan3.konus());

        //Fonksiyon kullanarak gösterim
        konustur(new Kedi("Nasip"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Bold-Pilot"));

        /*
        instanceof - polymorphism ilişkisi

        -Obje vereceğiz objenin hangi sınıftan olduğuna bakacağız

        -Kedi sınıfı aynı zamanda Hayvan sınıfından miras alıyor.
        Bu yüzden superclass'la kıyaslanırsa inheritance olduğu için true döner.

        -Bütün classlar objeden türüyor.(Object class)

        -Polymorphism kullanmazsak bütün nesneleri instanceof ile kontrol etmemiz gerekir.

        -Yeni bir sınıf üretirsek ve Hayvan sınıfından miras alırsa yine kontrol etmemiz gerekecek ama
        polymorphism bu iş yükünü azaltıyor.

         */



    }


}