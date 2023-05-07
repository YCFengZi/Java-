package StudentManger.domain;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private Float  height;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setHeight(Float height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public Student() {}
    public Student(int id, String name, String gender, int age, Float height) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student [" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ']';
    }
}
