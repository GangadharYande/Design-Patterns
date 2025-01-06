package src.Builder.ActualBuilder;

public class Student {
    private int id;
    private String name;
    private int age;



    public Student(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}
