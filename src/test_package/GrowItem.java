package test_package;

public class GrowItem {
	
	public String name;
	public int type;
	public int maturity;
	public int days;
	
	public static void main(String[] args) {
		GrowItem grow_item_test = new GrowItem("Tomato", 1, 20);
		grow_item_test.printGrowItem();

	}
	
	public GrowItem(){}
	
	public GrowItem(String name, int type, int maturity){
		this.name = name;
		this.type = type;
		this.maturity = maturity;
		this.days = 0;
	}
	
	public void printGrowItem() {
		System.out.print("name: " + this.name + " type: " + this.type + " maturity: " + this.maturity + " days: " + this.days + "\n");
		
	}

}


