package zoo;

import zoo.base.ITraining;
import zoo.base.Pet;

public class Dog extends Pet implements ITraining {
    private Boolean isTrained;

    public Dog(double height, double weight, String eyeColor, String name, String breed, String furColor, String dateOfBirth, Boolean isVaccinated) {
        super(height, weight, eyeColor, name, breed, furColor, dateOfBirth, isVaccinated);
        isTrained = false;
    }
    public Dog(double height, double weight, String eyeColor, String name, String breed, String furColor, String dateOfBirth, Boolean isVaccinated, Boolean isTrained) {
        super(height, weight, eyeColor, name, breed, furColor, dateOfBirth, isVaccinated);
        this.isTrained = isTrained;
    }


    @Override
    public void getVoice() {
        System.out.println(" Гав ");
    }

    @Override
    public void getPetted() {
        System.out.println(" Хороший мальчик ");
        this.isTrained = false;
    }


    @Override
    public void train() {
        System.out.println("Дрессировка");
        this.isTrained=true;
    }
    public Boolean getTrained(){
        return isTrained;
    }

}

