package zoo;

import zoo.base.Bird;

public class Stork extends Bird {

    public Stork(double height, double weight, String eyeColor, double flightAltitude) {
        super(weight,height,eyeColor,flightAltitude);
    }
    public Stork(double height, double weight, String eyeColor){
        super(height,weight,eyeColor);
    }

    @Override
    public void getVoice() {
        System.out.println(" Звуки аиста ");
    }
}
