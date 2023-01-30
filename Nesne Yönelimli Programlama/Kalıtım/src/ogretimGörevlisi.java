public class ogretimGörevlisi extends Akademisyen{

    private String kapıNo;

    public ogretimGörevlisi(String adSoyad, String telefon, String ePosta, String bolum, String unvan, String kapıNo){
        super(adSoyad, telefon, ePosta, bolum, unvan);
        this.kapıNo = kapıNo;
    }

    public String getKapıNo() {
        return kapıNo;
    }

    public void setKapıNo(String kapıNo) {
        this.kapıNo = kapıNo;
    }
}
