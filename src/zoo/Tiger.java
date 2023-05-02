package zoo;

import zoo.base.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(Double height, Double weight, String eyeColor, String habitat, Double dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public void getVoice() {
        System.out.println("РРР");
    }
}
