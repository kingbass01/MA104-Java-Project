public class runfile extends professor                                                      // Inherit class professor
{

    runfile(String n,int a, String dept, int teachingExp, double CPIcutoff)                  // Parameterized Constructor
    {
        super(n,a, dept, teachingExp, CPIcutoff);
    }

    static String compare(grades g, professor p)                                            // Function compare to compare CPI
    {
        if(grades.cpi >= p.CPIcutoff)
            return p.name;
        else
        return "";
    }

    static void mentor(grades g, professor p[])                                           // Function to find and print mentors
    {
            String s = "",w;
            for (int j = 0; j < p.length; j++)
            {
                w = compare(g,p[j]);
                if(w != "")
                s = s + w + ", ";
            }
            g.display();
            System.out.println("Can work under : "+s);
            System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Professors Details :-\n");
        professor prof[] = new professor[4];                                            // Creating array of objects of class professor
        prof[0] = new professor("Dr. L P Singh",54, "Mathematical Sciences", 17, 8.5);
        prof[1] = new professor("Dr. S K Singh",53, "Computer Science and Engineering", 23, 9);
        prof[2] = new professor("Dr. Ashok Gupta",50, "Mathematical Sciences", 18, 8);
        prof[3] = new professor("Dr. V K Singh",43, "Mathematical Sciences", 13, 7);
        for (int i = 0; i < prof.length; i++)
            prof[i].show();
        
        System.out.println("*******************************************************************************\n");
        System.out.println("Students Details :-\n");
        grades gr = new grades("Aryan", 18, "21124010", "MnC", 8.58);             // Creating object of class grades   
        mentor(gr,prof);                                                                                            // Calling function mentor
        gr = new grades("Piyush", 16, "21124041", "MnC", 8.57);
        mentor(gr,prof);
        gr = new grades("Anish", 18, "21065007", "ECE", 7.57);
        mentor(gr,prof);
        gr = new grades("Parangat", 18, "21283038", "CSE", 9.00);
        mentor(gr,prof);
    }
}