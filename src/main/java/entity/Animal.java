package entity;

/**
 * Created by Cagy on 9/7/2017.
 */
public class Animal {

    private String name;
    private String age;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void writeName(){
        System.out.println("My name is Kevin");
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
