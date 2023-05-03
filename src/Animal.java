public class Animal {
    private String ration;
    private String color;
    private double weight;

    public Animal(String ration, String color, double weight) {
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return "";
    }

    public void eat() {
    }

    public void sleep() {
    }

    @Override
    public String toString() {
        return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
    }
}
