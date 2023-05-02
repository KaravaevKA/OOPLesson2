package zoo.base;

public abstract class Animal implements IVoice {
    private double height;
    private double weight;
    private String eyeColor;

    public Animal(Double height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    public abstract void getVoice();

    public double getWeight(){

        return weight;
    }
    public double getHeight(){

        return height;
    }
    public String getEyeColor(){

        return eyeColor;
    }

    @Override
    public String toString() {
        return "Животное {" +
                "Рост " + height +
                ", вес: " + weight +
                ", цвет глаз: '" + eyeColor + '\'' +
                '}';
    }
}
