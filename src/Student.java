import java.lang.*;
import java.lang.reflect.InvocationTargetException;


interface Students
{
    String name = null;
    int usn = 0;
    public int getUsn();
    public String getName();
    public void setName(String name);
    public void setUsn(int usn);
}
class StudentInfo implements Students
{
    private String name;
    private int usn;

    public StudentInfo(String name, int usn)
    {
        this.name = name;
        this.usn = usn;
    }
    public StudentInfo()
    {
        this.name = "Abcd";
        this.usn = 98;
    }

    public String getName()
    {
        return name;
    }
    public int getUsn()
    {
        return  usn;
    }
    public void setUsn(int usn)
    {
        this.usn = usn;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}


public class Student {
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        StudentInfo st = new StudentInfo("abcd",98);
        System.out.println(st.getName());
        Reflect ref = new Reflect();
    }
}
