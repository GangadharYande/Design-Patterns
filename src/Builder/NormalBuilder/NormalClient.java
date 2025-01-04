package src.Builder.NormalBuilder;

public class NormalClient {
    public static void main(String[] args) {


        NormalBuilder normalBuilder = new NormalBuilder();
        normalBuilder.setId(1);
        normalBuilder.setName("Gangadhar");
        normalBuilder.setAge(27);

        NormalStudent normalStudent = new NormalStudent(normalBuilder);
        System.out.println("NormalStudent is - " + normalStudent);


    }
}
