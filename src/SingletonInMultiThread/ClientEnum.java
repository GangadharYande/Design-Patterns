package src.SingletonInMultiThread;

public class ClientEnum {
    public static void main(String[] args) {
        DataBaseConnectionSignletonEnumBest singleton = DataBaseConnectionSignletonEnumBest.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
