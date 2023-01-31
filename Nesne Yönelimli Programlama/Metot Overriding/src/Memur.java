public abstract class Memur {
    private String depertman;
    private String mesai;

    public Memur(String depertman, String mesai) {
        this.depertman = depertman;
        this.mesai = mesai;
    }

    public String getDepertman() {
        return depertman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println("Mesai başladı !!");
    }

    //override edilen methodlar @Override şeklinde yazılmalıdır,
    // programcıya override edildiğini gösterebilmek gereklidir.
    public abstract void networkKurulum();
}
