package src.Builder.NormalBuilder;


public class NormalStudent {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String PhoneNumber;

    public NormalStudent(NormalBuilder normalBuilder) {
        // validations
        if (normalBuilder.getAge() < 25) {
            throw new RuntimeException("Validation Failed");
        }
        this.age = normalBuilder.getAge();
        this.id = normalBuilder.getId();
        this.name = normalBuilder.getName();
        this.psp = normalBuilder.getPsp();
        this.universityName = normalBuilder.getUniversityName();
        this.email = normalBuilder.getEmail();
        this.PhoneNumber = normalBuilder.getPhoneNumber();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String toString() {
        return "NormalStudent{" +
                "id=" + id +
                ", name='" + name +
                "', age=" + age +
                ", psp=" + psp +
                ", universityName='" + universityName + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
