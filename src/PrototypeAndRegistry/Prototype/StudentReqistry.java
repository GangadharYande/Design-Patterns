package src.PrototypeAndRegistry.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentReqistry {

    private final  Map<String,Student> maps;

    public StudentReqistry() {

        this.maps = new HashMap<>();
    }

    public void register(String key, Student student){
        maps.put(key,student);

    }
    public Student get(String key){
        return maps.get(key);

    }
}
