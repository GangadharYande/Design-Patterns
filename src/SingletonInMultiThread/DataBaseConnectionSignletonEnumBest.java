package src.SingletonInMultiThread;

public class DataBaseConnectionSignletonEnumBest {
    public static final DataBaseConnectionSignletonEnumBest INSTANCE = new DataBaseConnectionSignletonEnumBest();

    int value;
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
