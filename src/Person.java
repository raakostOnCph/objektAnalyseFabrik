import java.util.Objects;

public class Person extends Object implements PersonIF, AlderIdageIF
{

    String navn;
    int alder;

    public Person(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    @Override
    public String toString()
    {
        return "Person{" + "navn='" + navn + '\'' + ", alder=" + alder + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return alder == person.alder && Objects.equals(navn, person.navn);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(navn, alder);
    }

    @Override
    public void udskrivOpl()
    {
        System.out.println("navnet var " + navn + " og alderen var " + alder );
    }

    @Override
    public void alderIdage()
    {
        System.out.println("aldere i dage er midst " + alder * 365);
    }
}
