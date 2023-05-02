package zoo;

import zoo.base.Bird;

public class Chicken extends Bird {
    public Chicken(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
    }
    public Chicken(double height, double weight, String eyeColor, double flightAltitude){
        super(height,weight,eyeColor,flightAltitude);
    }

    @Override
    public void getVoice() {
        System.out.println("Куд-кудах");
    }
}
