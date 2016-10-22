
public class SportMountainBike extends MountainBike {
	boolean iFrontShock;

	

	@Override
	void printStates() {
		System.out.print("frontShock:" + iFrontShock + " " );
		super.printStates();
	}

	public void setiFrontShock(boolean iFrontShock) {
		this.iFrontShock = iFrontShock;
	}



}
