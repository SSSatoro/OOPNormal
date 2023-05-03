public class Veterinarien {
    private String name;

    public Veterinarien(String name) {
        super();
        this.name = name;
    }

    public Veterinarien() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        System.out.println("name: "+ this.getName()+". helping: "+animal.getName());
    }

    @Override
    public String toString() {
        return "name: " + name + ", helping: "+Cat.class.getName()+" and "+Dog.class.getName();
    }


}
