import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here


        ObjectFabrik obf = new ObjectFabrik();


        obf.indsæt("integer", new Integer(4));

        String svar;

        while (true) {

            svar = getString("hvad ønsker du m, f, i , q for stop ");

            if (svar.equalsIgnoreCase("q")) {
                break;
            }


            switch (svar) {

                case "m":
                    udskriv(AnalyseObj.metoderErklærede(obf.hent(getString("skrive type"))));
                    break;
                case "f":
                    udskriv(AnalyseObj.felterErklærede(obf.hent(getString("skrive type"))));
                    break;
                case "i":
                    udskriv(AnalyseObj.interfacesErklærede(obf.hent(getString("skrive type"))));
                    break;
                case "h":
                    AnalyseObj.hierarki(getString("angiv typen"));

                default:
                    System.out.println(" m: udskriver metoder , f: udskriver felter, i : udskriver interfaces");

            }

        }



//        Person person = new Person("palle", 55);
//        Person person1 = new Person("palle", 55);
//
//        Field [] fields = person.getClass().getDeclaredFields();
//
//        for (Field field : fields) {
//
//            System.out.println( field.getName());
//        }
//
//        for (Method method : methods) {
//
//            System.out.println(method.getName());
//        }
//
//
//        System.out.println(person.toString());
//
//
//
//
//        System.out.println("samligning  : " + person.equals(person1));
//


//        try {
//            throw new Exception();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println("her slutter programmet");
//
//    }




        /*
         *
         * opgaver.
         *
         * I main:
         *
         * lav en metode som kun finder de metoder et objekt arver.
         *
         * lav en metoder, som givet en liste af objekter finde det objekt som har flest metoder
         *
         * Lav en metoder som afgøre om et objekt implementere et givet interface
         *
         *
         *
         *
         *
         *
         *
         *
         * */


    }


    public static String getString(String s)
    {

        System.out.print(s + " : ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();


    }

    public static void udskriv(Set<String> stringSet)
    {

        for (String s : stringSet) {

            System.out.println(s);
        }


    }


}