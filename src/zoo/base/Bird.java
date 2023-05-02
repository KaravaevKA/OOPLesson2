package zoo.base;

public abstract class Bird extends Animal{
    private double flightAltitude;
    public Bird(double height, double weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.flightAltitude = 0;
    }
    protected Bird(double height,double weight, String eyeColor, double flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }


    public  void fly(){
        System.out.printf("%Я лечу на высоте ",flightAltitude," метров над землей!");
    }
}
