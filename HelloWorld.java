import java.lang.*;
 
public class HelloWorld
{
    // HelloWorld is the name of the class. This file should be saved as HelloWorld.java. Public means that every class can access this file. Private means only this class will be able to access this file. Protected means only some classes can access this class.
 
     public static void main(String[] args)
     {
         int a = 209;
         char b ='A'; // char means character. The result has to be in single quotes.
       String c = "Fifth Floor"; // In strings, the result has to be in double quotes.
 
 
         // the above statement is part of every Java program. Jaca application automatically starts or executes the program at MAIN method. The perenthesis after MAIN indicate that MAIN is a program building block called a method.
         //VOID means the method will return null (nothing).
 
        System.out.println("Hello World");
        System.out.println("Asim Sayed");
        // This is the first statement which will be read by Java compiler. System.out is known as the standard output object. It allows Java application to display Strings and other types in the command window.
 
     System.out.println(a + b + " " + c); // + means concat the strings
 
     } //end of Main Method
} // end of class
 
 
