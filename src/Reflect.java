import java.lang.annotation.Inherited;
import java.lang.reflect.*;

public class Reflect
{
    Class reflectClass = StudentInfo.class;
    Reflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println("Reflection Class created\n");
        String className = reflectClass.getName();
        Class[] ifaces = reflectClass.getInterfaces();
        for(Class i: ifaces)
        {
            System.out.println("Implemented Interface " + i);
        }
        System.out.println("Class name: " + className);
        Method[] classMethods = reflectClass.getDeclaredMethods();
        for (Method method : classMethods) {
            System.out.print("Method Name: " + method.getName() + "    ");
            if (method.getName().startsWith("get")) {
                System.out.println("Type: Getter Method");
            } else if (method.getName().startsWith("set")) {
                System.out.println("Type: Setter Method");
            }
        }
        caller();
    }

    private void caller() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        StudentInfo obj = new StudentInfo();
        Method setter = reflectClass.getDeclaredMethod("setName", String.class);
        Method getter = reflectClass.getDeclaredMethod("getName");
        System.out.format("Name is currently set as %s \n", (String) getter.invoke(obj));
        setter.invoke(obj, "wxyz");
        String name = (String) getter.invoke(obj);
        System.out.format("setName invoked by reflection class. Changed name is %s", name);
    }
}
