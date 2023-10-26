public class Person extends Animal{
    
    private static int personCount = 0;

    private String firstName;
    private String lastName;
    private byte age;
    private int id;

    public Person()
    {
        this.firstName = "N/A";
        this.lastName = "";
        personCount++;
    }

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    public Person(String firstName, String lastName, byte age, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        personCount++;
    }

    public String speak()
    {
        if(this.firstName.equals("N/A"))
        {
            return "I don't have a name.";
        }
        else if(this.age == 0)
        {
            return "My name is " + this.firstName + " " + this.lastName + ".";
        }
        else
        {
            return "My name is " + this.firstName + " and I am " + this.age + " years old.";
        }
    }

    public String toString()
    {
        if(this.id == 0)
        {
            return this.firstName + " " + this.lastName;
        }
        else
        {
            return this.firstName + " " + this.lastName + " " + (this.id % 10000);
        }
    }

    public static int getPersonCount()
    {
        return personCount;
    }
}
