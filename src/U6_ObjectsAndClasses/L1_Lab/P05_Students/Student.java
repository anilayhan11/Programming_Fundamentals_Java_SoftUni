package U6_ObjectsAndClasses.L1_Lab.P05_Students;

public class Student {

    // Describe characteristics in fields (private).
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    // Create objects from the class with constructor.
    public Student(String firstName, String lastName, int age, String hometown) {
        // Created new empty object which has the values below.
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    // Create methods to describe possible actions of each student (object).
    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
