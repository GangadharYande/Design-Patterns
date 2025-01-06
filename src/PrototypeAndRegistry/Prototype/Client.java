package src.PrototypeAndRegistry.Prototype;

public class Client {
    public static void main(String[] args) {


        StudentReqistry registry = new StudentReqistry();
        fillRegistries(registry);



        Student student = registry.get("nov24batch").copy();
        student.setName("John");
        student.setAge(22);
        student.setGender("Male");
        student.setStudentPsp(80);
        student.setAveragePspOfBatch(200);

        System.out.println( student);

        Student copiedStudent = student.copy();

        copiedStudent.setName("Charan");
        copiedStudent.setAge(22);
        copiedStudent.setGender("female");
        copiedStudent.setStudentPsp(80);
        copiedStudent.setAveragePspOfBatch(20);
        copiedStudent.setBatch("Nov24");


        System.out.println( copiedStudent);

        Student nov2024batchIntelligentStudent = registry.get("nov2024batchIntelligentStudent").copy();
        nov2024batchIntelligentStudent.setName("Rocky");
        nov2024batchIntelligentStudent.setAge(22);


        System.out.println( nov2024batchIntelligentStudent);

        Student otherCopy = nov2024batchIntelligentStudent.copy();
        System.out.println(otherCopy);

    }

    private static void fillRegistries(StudentReqistry registry) {


        Student nov2024batch = new Student();
        nov2024batch.setAveragePspOfBatch(90);
        nov2024batch.setBatch("Nov24");

        IntelligentStudent nov2024batchIntelligentStudent = new IntelligentStudent();
        nov2024batchIntelligentStudent.setAveragePspOfBatch(90);
        nov2024batchIntelligentStudent.setBatch("Nov24");
        nov2024batchIntelligentStudent.setAveragePspOfBatch(100);

        registry.register("nov24batch", nov2024batch);
        registry.register("nov2024batchIntelligentStudent", nov2024batchIntelligentStudent);
    }
}
