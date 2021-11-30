DEADLINE : 30 November

REFLECTION METHOD IN JAVA
Reflection is a feature in the Java programming language that allows inspection or modification of behavior of methods, classes,constructors, interfaces, and fields at runtime.<br/>
* The required classes for reflection are provided under `java.lang.reflect` package.
* Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.

Reflection can be used to get information about the following:
1.  Class : The getClass() method is used to get the name of the class to which an object belongs.
1.  Constructors : The getConstructors() method is used to get the public constructors of the class to which an object belongs.
1.  Methods : The getMethods() method is used to get the public methods of the class to which an objects belongs.


Example : Java Class Reflection

```bash
import java.lang.reflect.*;

public class ReflectionHelloWorld
{
  public static void main(String[] args)
  {
    Hello f = new Hello();
    System.out.println(f.getClass().getName());
  }
}
class Hello
{
  public void print()
    {
      System.out.println("Hello World");
    }
}
```
```bash
Output : Reflection.Hello
```

 Advantages of Using Reflection :
* Inspection and Modification : Inspection of interfaces, classes, methods, and fields during runtime is possible using reflection, even without using their names during the compile time.It is also possible to call methods, instantiate a clear or to set the value of fields using reflection.
* Debugging and testing tools : Debuggers use the property of reflection to examine private members on classes.
* Extensibility Features : An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.

 Drawbacks of Using Reflection :
* Exposure of Internals : Reflective code breaks the principles of encapsulation. It is possible to access the private methods and fields of a class using reflection. Thus, reflection may leak important data to the outside world, which is dangerous.
* Performance Overhead : Reflective operations have slower performance than their non-reflective counterparts.
