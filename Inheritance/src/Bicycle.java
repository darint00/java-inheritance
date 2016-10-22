
public class Bicycle {

    int iCadence = 0;
    int iSpeed   = 0;
    int iGear    = 1;

    void changeCadence(int newValue) {
         iCadence = newValue;
    }

    void changeGear(int newValue) {
         iGear = newValue;
    }

    void speedUp(int increment) {
         iSpeed = iSpeed + increment;   
    }

    void applyBrakes(int decrement) {
         iSpeed = iSpeed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             iCadence + " speed:" + 
             iSpeed + " gear:" + iGear);
    }
    
}
