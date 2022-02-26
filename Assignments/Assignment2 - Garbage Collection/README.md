Deadline: 1 Dec

Garbage Collection in Java
- In Java, garbage means unreferenced objects. So,
Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
- Java applications obtain objects in memory as needed. It is the task of garbage collection (GC) in the Java virtual machine(JVM) to automatically determine what memory is no longer being used by a Java application and to recycle this memory for other uses. Because memory is automatically reclaimed in the JVM, Java application developers are not burdened with having to explicitly free memory objects that are not being used.
- Basically garbage collector use Mark and Sweep algorithm to clear unused memory.<br/>
finalize() method :
The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:
public void finalize( ) { }
 gc() method :
The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
 public static void gc( ) { } 



Simple Example of Garbage Collection in Java :
````
public class TestGarbage1{ 
  public void finalize()
  { 
  System.out.println("Garbage is collected");
  }
  public static void main(String args[]){ 
    TestGarbage1 s1=new TestGarbage1(); 
    TestGarbage1 s2=new TestGarbage1(); 
    s1=null; 
    s2=null; 
    System.gc(); 
  } 
} 
````

Output :
Garbage is collected
Garbage is collected
 
 Advantages of Garbage Collection 
- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
