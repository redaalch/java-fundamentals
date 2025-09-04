package inheritance;

public class Person {
    private String Name;
    private int age;
    private String gender;


    public Person() {
        System.out.println("in person default constructor");
    }
    public Person(String name) {
        System.out.println("in person 2nd constructor");
        setName(name);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
