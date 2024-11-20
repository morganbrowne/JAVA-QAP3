package QAP3.Problem1;

public class CollegeStudent extends Student {
    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major ) {
        super(name, age, gender,  idNum, gpa);
        this.year = year;
        this.major = major;

    }
    // Getter Methods for CollegeStudent...
    public int getYear() {
        return year;
    }
    public String getMajor() {
        return major;
    }

    // Setters for College Student...
    public void setYear(int year) {
        this.year = year;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    //toString Method...
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
