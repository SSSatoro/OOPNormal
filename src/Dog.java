public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, double weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
        super();
    }

    public Dog(String ration, String color, int weight) {
        super(ration, color, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getVoice() {
        return "gaf";
    }

    public void eat() {
        System.out.println(this.name + " eats "+this.getRation());
    }

    public void sleep() {
        System.out.println(this.name+" sleeping");
    }

    @Override
    public String toString() {
        return "I am " + name + ", I can speak: " + getVoice() + ", my favorite food is "
                + getRation() + ", my color is " + getColor() + ", my weight is " + getWeight()+"kg";
    }


}
