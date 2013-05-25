package test_package;

public class FieldInfo {

	public int type;
	public int days;
	public int maturity;

	public static void main(String[] args) {
		FieldInfo field_info_test = new FieldInfo(1, 20);
		field_info_test.printFieldInfo();
		field_info_test.increaseDays(2);
		field_info_test.printFieldInfo();
		field_info_test.checkMaturity();
		field_info_test.increaseDays(20);
		field_info_test.printFieldInfo();
		field_info_test.checkMaturity();

	}
	
	//FieldInfo constructor
	public FieldInfo(int type, int maturity) {
		this.type = type;
		this.maturity = maturity;
		this.days = 0;
	}
	
	public void printFieldInfo(){
		System.out.print("Type: " + this.type + "\nDays: " + this.days + "\n");
	}
	
	public void increaseDays(int time_amt){
		this.days += time_amt;
	}
	
	public void checkMaturity() {
		if (this.days > this.maturity) {
			System.out.print("Mature!\n");
		} else {
			System.out.print("Still growing!\n"); 
		}
	}

}
