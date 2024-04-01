package U6_ObjectsAndClasses.L1_Lab.P06_Students2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    // Constructor -> create objects from the class
    public Student(String firstName, String lastName, int age, String hometown) {
        //нов празен обект
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    //methods -> possible actions of each student (object).
    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
