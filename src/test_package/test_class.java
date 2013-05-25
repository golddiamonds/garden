package test_package;

import java.util.Scanner;

//class for running overall main method and testing all other classes in package
public class test_class {

	//main
	public static void main(String[] args) {
		//String name;
		Scanner reader = new Scanner (System.in);
		//System.out.println("Enter your name");
		//name = reader.nextLine();
		//System.out.println(name);
		
		//create a field 
		Field field_test = new Field(5,5);
		
		//main loop
		boolean run;
		run = true;
		String command;
		int x,y,growitem;
		while (run == true){
			field_test.printDimensions();
			System.out.print("> ");
			command = reader.next();
			System.out.println("You typed: '" + command + "'");
			if (command.equals("q")) {
				System.out.println("Quitting...");
				run = false;
			}
			if (command.equals("p")){
				System.out.print("x? ");
				x = reader.nextInt();
				System.out.print("y? ");
				y = reader.nextInt();
				System.out.print("What are you planting? ");
				growitem = reader.nextInt();
				field_test.changeFieldValue(x, y, growitem);
			}
		}
		
		reader.close();
		

	}

}
