package src.Builder.ActualBuilder;


public  class Builder {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build(){
        if(this.getAge()<25){
            throw new RuntimeException("Validation failed");
        }
        return new Student(this);
    }
}