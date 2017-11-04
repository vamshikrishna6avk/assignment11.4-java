/*program for reating parent class as ExceptionDemo,throws statement and throws checke exception
 * creating child class extends parents class in child class throws statement throws another exception from the parent one
 * exceptions occur during run time
 */
package session11; //here package name as session11

import java.io.IOException;//taken IoException package 

public class ExceptionDemo { //here created class as ExceptionDemo
	                        //classes are the basics of the oops(object oriented programminng)

 void show() throws ArithmeticException {//void as no return type or value
	                                    //throws airthemeticException
    System.out.println("parent class");////systemm is used to return code
	//out is a static number
	//Println is used to print  and gives output
    }
}

 class Child extends ExceptionDemo {//extends class ExceptionDemo
         void show() throws IOException {      		//Compile time Error  	  
  
	  System.out.println("child class");//systemm is used to return code
		//out is a static member
		//Println is used to print text perimeter of circle and gives output
	  } 

   public static void main(String[]args){
		
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//String[]args means arguments will be passed into main method and says that main() as a parameter

 
  try {
   ExceptionDemo sub=new Child();//taking new child
      sub.show();//compile time error
   }
  catch(Exception e){
	  
  }
 }  
}