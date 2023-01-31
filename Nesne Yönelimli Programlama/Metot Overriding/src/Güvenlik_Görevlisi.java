public class Güvenlik_Görevlisi extends Memur{
    private String belge;

    public Güvenlik_Görevlisi(String depertman, String mesai, String belge) {
        super(depertman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.print("Nöbet saatit başladı !!");
    }

    //Method Overloading (Metotlarda Aşırı Yükleme)
    public void nobet(String belge){
        System.out.print(belge + " belgesinin teslimi ile nöbet başlandı !!");
    }

    //Method Overriding ise aynı method isminde başka bir sınıfta method oluşturma
    //Örnek verelim:

    //override edilen methodlar @Override şeklinde yazılmalıdır,
    // programcıya override edildiğini gösterebilmek gereklidir.
    @Override
    public void networkKurulum(){
        System.out.print(getMesai());
    }


}

