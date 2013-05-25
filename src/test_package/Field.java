package test_package;

//class for field generation, manipulation, and presentation.
public class Field {

	//variables
	public int width, height;
	public int[][] fieldArray;
	
	
	//main
	public static void main(String[] args) {
		
		Field field_test = new Field(5,5);
		field_test.printDimensions();
		field_test.changeFieldValue(1, 2, 3);
		field_test.printDimensions();
		field_test.changeFieldValue(1,4,2);
		field_test.changeFieldValue(1, 2, 4);
		field_test.printDimensions();

	}
	
	//field constructor
	public Field(int width, int height){
		this.width = width;
		this.height = height;
		this.fieldArray = new int[this.width][this.height];
		this.generateField();
	}
	
	//generates values within field array
	//keep private, because you only want to do this on initialization
	private void generateField(){
		int n, m;
		n = m = 0;
		while (n < this.height){
			while (m < this.width){
				this.fieldArray[n][m] = 0;
				m = m + 1;
			}
			m = 0;
			n = n + 1;
		}
	}
	
	//prints out values in field array
	public void printDimensions(){
		System.out.print("Width: " + this.width + " Height: " + this.height);
		int n, m;
		n = m = 0;
		
		System.out.print("\n");
		while (n < 5){
			while (m < 5){
				System.out.print(this.fieldArray[n][m] + " ");
				if (m ==4){
					System.out.print("\n");
				}
				m = m + 1;
			}
			m = 0;
			n = n + 1;
		}
	}
	
	public void changeFieldValue(int x, int y, int value){
		
		//check to see space is empty
		if (this.fieldArray[x][y] == 0) {
			
			this.fieldArray[x][y] = value;
			System.out.print("\nValue at x = " + x + " and y = " + y + " is now " + value + "\n");
			
		} else {
			
			System.out.print("\nThere is already something there.\n");
			
		}
	}
}
