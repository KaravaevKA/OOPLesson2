package zoo;

import zoo.base.WildAnimal;

public class Wolf extends WildAnimal {
    private Boolean packLeader;
    public Wolf(double height, double weight, String eyeColor, String habitat, double dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        packLeader = false;
    }

    public Wolf(double height, double weight, String eyeColor, String habitat, double dateOfLocation, Boolean packLeader) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        this.packLeader = packLeader;
    }
    public Boolean getPackLeader(){
        return packLeader;
    }

    @Override
    public void getVoice() {
        System.out.println(" Когда волк молчит, лучше его не перебивать.. ");
    }
}
