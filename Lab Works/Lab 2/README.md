## Due date 31 Dec 2021 Submission date 05 Jan 2022
# 1. WAP to demonstrate the use of user defined package in java.
```

[//]: #packageDemo.java

package com.gces.pkg;

public class PackageDemo
{
    public void showMessage()
    {
        System.out.println("Simple package example.");
    }
    public static void main(String[] args) 
    {
        System.out.println("Package is created.");
    }
}

[//]: #demo.java

import com.gces.pkg.PackageDemo;

public class Demo 
{
    public static void main(String[] args) 
    {
        PackageDemo demo = new PackageDemo();
        demo.showMessage();
    }
    
}
```

# 2. WAP to demonstrate Exception handling with all 5 keywords: try, catch, finally, throw and throws.
```

[//]: #TryCatchDemo.java

public class TryCatchDemo 
{
    public static void main(String[] args) 
    {
        int num1 = 30;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
            System.out.println("The output is :"+result);
        }catch(ArithmeticException e){
            System.out.println("Error message: "+ e.getMessage());
        }
    }
}
[//]: #FinallyDemo.java

public class FinallyDemo 
{
    public static void main(String[] args) 
    {
        int num1 = 30;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
            System.out.println("The output is :"+result);
        }catch(ArithmeticException e){
            System.out.println("Error message: "+ e.getMessage());
        }
        finally
	{
            System.out.println("In finally all statements are bound to run at least once even if error occurs in try-catch or other Exceptions");
        }
    }
}
[//]: #ThrowDemo.java

public class ThrowDemo
{
    public void eligibility (int age)
	{
		if (age < 18) 
		{
			throw new ArithmeticException("Not eligible to drink or smoke or should not be able to purchase!!");
		}
        else
	{
            System.out.println("Enjoy ruining your healthy body!!");
        }
	}
    public static void main(String[] args)
	{
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.eligibility(17);
		}catch(ArithmeticException error) 
		{
			System.out.println("Exception message : "+error.getMessage());
		}

	}
}

[//]: #ThrowsDemo.java

public class ThrowDemo 
{
    public void eligibility (int age)
	{
		if (age < 18) 
		{
			throw new ArithmeticException("Not eligible to drink or smoke or should not be able to purchase!!");
		}
        else
	{
            System.out.println("Enjoy ruining your healthy body!!");
        }
	}
    public static void main(String[] args)
	{
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.eligibility(17);
		}catch(ArithmeticException error) 
		{
			System.out.println("Exception message : "+error.getMessage());
		}

	}
}
```


# 3. Create your own exception class called InvalidAgeException which is thrown if the given age is less than 1 and greater than 100.
```

[//]: #DemoException.java

public class DemoException 
{
    public static void main(String[] args) 
    {
        
    }
    
}

[//]: #InvalidAgeException.java

public class InvalidAgeException extends Exception
{
    private double value;

    public InvalidAgeException(double value, String message)
    {
        super(message);
        this.value = value;
        if(value < 1 || value > 100)
	{
            message = "Age is not to be lessthan 1 nor exceeds 100";
        }
    }
}
```

# 4. WAP to demonstrate the use of chained Exception.
```

[//]: #ChainedException.java

public class ChainedException 
{
    public static void main (String args[])throws Exception 
    { 
        int number = 20, result = 0;
        try
	{ 
            result = number/0;
            System.out.println("The result is "+result);
        } 
	catch(ArithmeticException error1) 
	{ 
            System.out.println ("Arithmetic exception occoured: "+error1);
            try
	    { 
                throw new NumberFormatException();
            } catch(NumberFormatException error2) 
	    {
                System.out.println ("Chained exception thrown manually : "+error2);
            }
        }
    }
}
```

# 5. WAP to merge data from two files into third file.

```

 [//]: #FileMerge.java
 
  import java.io.*;
  
public class FileMerge 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("file2.txt"));
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}


[//]: #MergingFiles.java

import java.io.*;
  
public class MergingFiles 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader bwriter1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bwriter2 = new BufferedReader(new FileReader("file2.txt")); 
        String line1 = bwriter1.readLine();
        String line2 = bwriter2.readLine();
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = bwriter1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = bwriter2.readLine();
            }
        }
        pw.flush();
        bwriter1.close();
        bwriter2.close();
        pw.close();  
        System.out.println("Merged into file3.txt");
    }
}

<!--files should be creates as file1.txt file2.txt and file3.txt --!>
```

# 6. WAP to merge data from all files present in Desktop into output.txt.
```

[//]: #MergeFromDesktop.java 
 
import java.io.*;

class MergeFromDesktop
 {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("C:\\Lenovo\\Desktop");
        PrintWriter pw = new PrintWriter("output.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);
            File f = new File(dir, fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fileName);
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }
        System.out.println("Reading from all files" +
        " in directory " + dir.getName() + " Completed");
    }
} 
<!-- File should be creates as output.txt -->
```
