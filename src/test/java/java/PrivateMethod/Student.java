package java.PrivateMethod;

public class Student {

    private String sex;
    private int age;
    private String name;

    public Student(String sex, int age, String name){

        this.sex = sex;
        this.age = age;
        this.name = name;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   @Override
    public String toString(){

        return "name: " + getName() + " sex: " + getSex() + " age: " + getAge();
    }




}
