public class Cat extends Animal{
    private String ration;
    private String color;
    private double weight;

    public Cat(String ration, String color, int weight) {
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Cat(String food, String colour, double weight, String name) {
        super();

    }

    public String getRation() {
        return ration;
    }

    public String getName() {
        return this.getName();
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return "meoh";
    }

    public void eat() {
    }

    public void sleep() {
    }

    @Override
    public String toString() {
        return "name:" + getName() + ", voice: " + getVoice() + ", ration: "
                + getRation() + ", color : " + getColor() + ", weight kg:" + getWeight();
    }
}
