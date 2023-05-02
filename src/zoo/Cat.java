package zoo;

import zoo.base.Pet;

public class Cat extends Pet {
    private Boolean hasWool;

    public Cat(double height, double weight, String eyeColor, String name, String breed, String furColor, Boolean isVaccinated, Boolean hasWool, String dateOfBirth) {
        super(height, weight, eyeColor, name, breed, furColor, dateOfBirth, isVaccinated);
        this.hasWool = hasWool;
    }
    public Cat(double height, double weight, String eyeColor, String name, String breed, String furColor, String dateOfBirth, Boolean isVaccinated) {
        super(height, weight, eyeColor, name, breed, furColor, dateOfBirth, isVaccinated);
    }

    @Override
    public void getVoice() {

        System.out.println(" мяу ");
    }

    public void getPetted(){
        System.out.println("Погладь меня! ");
    }
    public Boolean getHasWool(){
        return hasWool;
    }
}
