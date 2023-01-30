public class Student {
    private String name;
    private String surname;
    private String idno;
    private String address;
    private int note;

    public Student(String name, String surname, String idno, String address, int note){
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.address = address;
        if(note < 0 || note > 100){
            note = 0;
        }
        this.note = note;
    }

    public String getName(){
        return this.name;
    }
    //Bütün get ve set methodlarını otomatik olarak yazmak için
    //Code -> Generate diyip yazdırabiliriz.
    //veya command + N ile de Generate penceresine ulaşıyoruz.

    public String getSurname() {
        return surname;
    }

    public String getIdno() {
        return idno;
    }

    public String getAddress() {
        return address;
    }

    public int getNote() {
        return note;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNote(int note) {
        if(note < 0 || note > 100){
            note = 0;
        }
        this.note = note;
    }


}
