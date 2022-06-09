public class person
{
    static int age;                                         // Global variables
    static String name;
    person(String name, int age)                            // Parameterized Constructor
    {
        person.age = age;
        person.name = name;
    }
    public static void main(String[] args)
    {
        System.out.println("Name : "+name);                // Printing name
        System.out.println("Age : "+age+" years");         // and age
    }
}