//MountainBike Class

public class MountainBike extends Bicycle {

	boolean iShock;

	void setShock(boolean newValue) {
		iShock = newValue;
	}
	
	@Override
	void printStates() {
		System.out.print("shock:" + iShock + " " );
		super.printStates();
	}
}
