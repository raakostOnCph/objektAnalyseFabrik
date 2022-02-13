import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class AnalyseObj
{


    public static Set<String> felterErklærede(Object o) {

        Field[] fields = o.getClass().getDeclaredFields();

        Set<String> res = new TreeSet<>();

        for (Field field : fields) {

            res.add(field.getName());
        }

        return res;

    }

    public static Set<String> metoderErklærede (Object o) {

        Method[] methods = o.getClass().getMethods();

        Set<String> res = new TreeSet<>();

        for (Method method : methods) {

            res.add(method.getName());

        }

        return res;

    }

    public static Set<String> interfacesErklærede (Object o ) {

        Class<?> [] interfaces =  o.getClass().getInterfaces();

        Set<String> res = new TreeSet<>();

        for (Class<?> anInterface : interfaces) {

            res.add(anInterface.getName());
        }

        return res;



    }

    public static void hierarki(Object o)
    {

        Class<?> obj = o.getClass();
        System.out.println(obj.getSimpleName());

        while (true) {

            obj = obj.getSuperclass();
            System.out.println(obj.getSimpleName());
            if (obj.getSimpleName().equals("Object")) {
                break;
            }

        }


    }
}
