package zoo.base;

public abstract class WildAnimal extends Animal{

    public WildAnimal(Double height, Double weight, String eyeColor, String habitat, Double dateOfLocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }

    private String habitat;
    private Double dateOfLocation;

}
