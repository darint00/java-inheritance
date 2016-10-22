
public class BicycleDemo {
	 public static void main(String[] args) {
		 
		 	// Create two different 
		 	// Bicycle objects
		 	Bicycle bike1 = new Bicycle();
		 	Bicycle bike2 = new Bicycle();
		 	MountainBike bike3 = new MountainBike();
		 	SportMountainBike bike4 = new SportMountainBike();

	        // Invoke methods on 
	        // those objects
	        bike1.changeCadence(50);
	        bike1.speedUp(10);
	        bike1.changeGear(2);
	        System.out.print("Bike 1: ");
	        bike1.printStates();

	        bike2.changeCadence(50);
	        bike2.speedUp(10);
	        bike2.changeGear(2);
	        bike2.changeCadence(40);
	        bike2.speedUp(10);
	        bike2.changeGear(3);
	        System.out.print("Bike 2: ");
	        bike2.printStates();
	        
	        bike3.changeCadence(50);
	        bike3.speedUp(10);
	        bike3.changeGear(2);
	        bike3.changeCadence(40);
	        bike3.speedUp(10);
	        bike3.changeGear(3);
	        System.out.print("Bike 3: ");
	        bike3.setShock(true); 
	        bike3.printStates();
	        
	        bike4.changeCadence(50);
	        bike4.speedUp(10);
	        bike4.changeGear(2);
	        bike4.changeCadence(40);
	        bike4.speedUp(10);
	        bike4.changeGear(3);
	        System.out.print("Bike 4: ");
	        bike4.setShock(true); 
	        bike4.setiFrontShock(true); 
	        bike4.printStates();
	        
	       
	        
	        
	        
	        
	        
	    }
}
