package src.PrototypeAndRegistry.Prototype;

public class IntelligentStudent extends Student {
    private int iq;
    private double averageIqOfbatch;

    public IntelligentStudent(){

    }
    public IntelligentStudent (IntelligentStudent other){
        super(other);
        this.iq=other.iq;
        this.averageIqOfbatch= other.averageIqOfbatch;

    }

    public void setIq(int iq) {
        this.iq = iq;
    }



    public void setAverageIqOfbatch(double averageIqOfbatch) {
        this.averageIqOfbatch = averageIqOfbatch;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", iq=" + iq +
                ", averageIqOfbatch=" + averageIqOfbatch +
                '}';
    }

    @Override
    public IntelligentStudent copy(){

        return new IntelligentStudent(this);

    }

}
