package U6_ObjectsAndClasses.L2_Exercise.P03_OpinionPoll;

public class Person {
    //1. Fields -> Characteristics
    //- Access modifier is private.
    private String name;
    private int age;

    //2. Constructor -> Method through which an object is created from the class
    //- Access modifier is public.
    //- Has the same name as the class.

    public Person(String name, int age) {
        // This is initially a new empty object with "name:null" and "age:0".
        // With the "this" keyword below, the object receives values.

        this.name = name;
        this.age = age;
    }

    //4. Methods -> Actions that the object can do (getters and setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
