package src.PrototypeAndRegistry.Prototype;

public class Student implements Prototype<Student>{


    private String name;
    private int age;
    private String gender;
    private String batch;
    private double averagePspOfBatch;
    private double studentPsp;

    public  Student (){

    }
    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.studentPsp = other.studentPsp;
        this.gender = other.gender;
        this.averagePspOfBatch= other.averagePspOfBatch;
        this.batch= other.batch;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAveragePspOfBatch() {
        return averagePspOfBatch;
    }

    public void setAveragePspOfBatch(double averagePspOfBatch) {
        this.averagePspOfBatch = averagePspOfBatch;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student copy(){
        Student student =new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setGender(this.gender);
        student.setStudentPsp(this.studentPsp);
        student.setAveragePspOfBatch(this.averagePspOfBatch);
        student.setBatch(this.batch);

        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", batch='" + batch + '\'' +
                ", averagePspOfBatch=" + averagePspOfBatch +
                ", studentPsp=" + studentPsp +
                '}';
    }
}
