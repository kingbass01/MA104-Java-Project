public class professor extends person
{
    String name;
    int teachingExp,age;
    String dept;
    double CPIcutoff;

    professor(String name,int age ,String dept, int teachingExp, double CPIcutoff)     // Parameterized Constructor
    {
        super(name,age);
        this.name = name;
        this.age = age;
        this.teachingExp = teachingExp;
        this.dept = dept;
        this.CPIcutoff = CPIcutoff;
    }

    void show()
    {
        System.out.println("Name : "+name);                                         // Printing details of Professor
        System.out.println("Age : "+age+" years");
        System.out.println("Teaching Experience : "+teachingExp+" years");
        System.out.println("Department : "+dept);
        System.out.println("Minimum CPI : "+CPIcutoff);
        System.out.println();
    }
}