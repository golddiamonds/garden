package test_package;


//import java.util.Scanner;


//class for running overall main method and testing all other classes in package
public class test_class {

	//main
	public static void main(String[] args) {
		//String name;
		//Scanner reader = new Scanner (System.in);
		//System.out.println("Enter your name");
		//name = reader.nextLine();
		//System.out.println(name);
		
		//create a field 
		Field field_test = new Field(5,5);
		field_test.printDimensions();
		field_test.changeFieldValue(0, 0, 1);
		field_test.printDimensions();
		field_test.changeFieldValue(0, 1, 1);
		field_test.changeFieldValue(4,4,2);
		field_test.changeFieldValue(3,4,5);
		field_test.printDimensions();

	}

}
