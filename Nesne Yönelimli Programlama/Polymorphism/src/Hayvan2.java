class Hayvan2{
    private String isim;

    public Hayvan2(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan Konuşuyor...";
    }
}

class Kedi2 extends Hayvan2{

    public Kedi2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }
}

class Kopek2 extends Hayvan2 {

    public Kopek2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor...";
    }
}

class At2 extends Hayvan2 {

    public At2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor...";
    }
}

public class Main {

    public static void konustur(Object object){

        if (object instanceof Kopek){
            Kopek kopekTest = (Kopek)object;
            System.out.println(kopekTest.konus());
        }
        else if(object instanceof Kedi){
            Kedi kediTest = (Kedi)object;
            System.out.println(kediTest.konus());
        }
        else if (object instanceof At){
            At atTest = (At)object;
            System.out.println(atTest.konus());
        }
        else if (object instanceof Hayvan){
            Hayvan hayvanTest = (Hayvan)object;
            System.out.println(hayvanTest.konus());
        }
    }

    public static void main(String[] args){

        // Temel Gösterim
        Kedi kedi = new Kedi("Nasip");

        if (kedi instanceof Kedi){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        Kedi kedii = new Kedi("Nasip");
        Kopek kopek = new Kopek("Zizu");
        At at = new At("BoldPilot");
        Hayvan hayvan = new Hayvan("Turunç");

        konustur(kedii);
        konustur(kopek);
        konustur(at);
        konustur(hayvan);

        /*
        Yukarıdaki Örnek II Polymorphism'in gerçek faydasını tam olarak ortaya çıkartıyor.
        Daha fazla hata yapma ihitmali, daha fazla kod ve daha fazla manuel kontrol.
        Sonuç olarak, polymorphism kullanmak kod temizliği ve
        güvenliği açısından verimli bir özellik.

         */
    }
}
