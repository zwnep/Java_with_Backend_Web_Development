public class Bilgi_İşlem extends Memur{

    private String gorev;

    public Bilgi_İşlem(String depertman, String mesai, String gorev) {
        super(depertman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum(){
        System.out.print("Kurulum işlemi gerekmektedir !!");
    }
}
