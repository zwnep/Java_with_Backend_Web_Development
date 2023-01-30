public class Calisan {

    public String adSoyad;
    public String telefon;
    public String ePosta;

    public Calisan(String adSoyad, String telefon, String ePosta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public void giris(){
        System.out.println(this.adSoyad+ " üniversiteye giriş yaptı !!");
    }

    public void cikis(){
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı !!");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad + " yemekhaneye girdi !!");
    }

}
