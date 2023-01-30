public class Course {

    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor){
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double calcAvarage(Student[] studnets){
        double sum = 0.0;
        for (int i = 0; i < studnets.length; i++){
            sum = studnets[i].getNote();
        }
        return sum / studnets.length;
    }
    //Bir sınıf başka bir sınıftan üretilmiş nesneleri alıyor ve
    // sınıflar arası ilişkilere bir örnek vermiş olduk.
    //Course sınıfının içindeki calcAvarage metodu Student sınıfına bağlıdır.


    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
