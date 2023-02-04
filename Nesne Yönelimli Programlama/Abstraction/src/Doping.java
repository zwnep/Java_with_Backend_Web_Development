// abstract sınıf örneği
public abstract class Doping {

    protected double price;
    protected double[] taxes;

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // soyut metot örneği
    public abstract double calculate();
}
//Yukarıdaki durumda "abstract" sınıf tanımlayıp diğer doping çeşitleri bu ATA sınıftan kalıtım alacaklardır.
// "calculate" isimli "abstract" metodu,
// "metod ezme" (overriding) yöntemiyle ezip metodun içini kendilerine göre dolduracaklardır.
// Alt sınıflardaki diğer özellikler soyutlama tekniğiyle dış dünyadan gizlenecektir.
//Dış dünyadan dopingi kullanmak isteyen baka bir sınıf veya
// kod parçası doping nesnesi üzerindeki "calculate" fonksiyonunu çağırıp fiyatı hesaplacaktır.
// Diğer iç hesaplama ve çalışma detaylarını bilmeyecektir.

