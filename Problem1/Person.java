package QAP3.Problem1;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender; // ("M" or "F")

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
  
    //Person Get Methods...
    public String getName() {
        return myName;
    }
    public int getAge() {
        return myAge;
    }
    public String getGender() {
        return myGender;
    }

    //Person Set Methods... 
    public void setName(String name) {
        myName = name;
    }
    public void setAge(int age) {
        myAge = age;
    }
    public void setGender(String gender) {
        myGender = gender;
    }


    public String toString() {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }

}
