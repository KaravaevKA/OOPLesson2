package zoo.base;

public abstract class Pet extends Animal {


    private String name;
    private String breed;
    private String furColor;
    private String dateOfBirth;
    private Boolean isVaccinated;

    public Pet(Double height, Double weight, String eyeColor, String name, String breed, String furColor, String dateOfBirth, Boolean isVaccinated) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.furColor = furColor;
        this.dateOfBirth = dateOfBirth;
        this.isVaccinated = isVaccinated;
    }
    public abstract void getPetted();
}
