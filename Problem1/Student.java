package QAP3.Problem1;

public class Student extends Person {
    protected String myIdNum; // Stidents ID Number. 
    protected double myGPA;  // Studends GPA. 

    public Student(String name, int age, String gender, String idNum, double gpa) {
         
        // Super Class Constuctor... 
        super(name, age, gender);
        // initialze to student specific class.
        myIdNum = idNum;
        myGPA = gpa;
        
    }
    // Studernt Get Methods. 
    public String getIdNum() { 
        return myIdNum; 
    }            
    public double getGPA() {
        return myGPA;
    }
    // Setter for Student Class. 
    public void setIdNum(String idNum) { 
        myIdNum = idNum; 
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    //toString method...
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
