public class student extends person                                    //Inherit class person
{
    static String rollno, branchCode;
    student(String name, int age, String rollno, String branchCode)    // Parameterized Constructor
    {
        super(name, age);                                              // Use of super keyword
        student.rollno = rollno;
        student.branchCode = branchCode;
    }

    static void disp()
    {
        person.main(null);                                       // Using class person to print name and age
        System.out.println("Roll no. : "+rollno);
        System.out.println("Branch : "+branchCode);
    }
}