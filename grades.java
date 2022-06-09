public class grades extends student                                                // Inherit class student
{
    static double cpi;
    grades(String name, int age, String rollno,String branchCode, double cpi)     // Parameterized Constructor
    {
        super(name, age, rollno, branchCode);
        grades.cpi = cpi;
    }

    void display()
    {
        student.disp();                                                           // Calling function disp of class student
        System.out.println("CPI : "+cpi);
    }
}