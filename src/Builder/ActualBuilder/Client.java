package src.Builder.ActualBuilder;



public class Client {
    public static void main(String[] args) {


        Student student = Student.getBuilder()
                .setId(1)
                .setName("Vishal")
                .setAge(27)
                .build();

        System.out.println("Student is - " + student);
    }
}
