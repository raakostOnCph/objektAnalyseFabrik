import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ObjectFabrik
{

    private Map<String , Object> objectMap = new HashMap<>();

    public ObjectFabrik()
    {

        objectMap.put("obect", new Object());
        objectMap.put("person", new Person("palle", 53));
        objectMap.put("set", new HashSet<>());
        objectMap.put("map", new HashMap<>());
        objectMap.put("string", new  String("hej med dig"));


    }


    public void indsæt(String s, Object o) {

        objectMap.put(s.toLowerCase(), o);




    }

    public Object hent(String s ) {

        return objectMap.getOrDefault(s.toLowerCase(), new Object() );


    }
}
