public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("fish", "ginger", 6.5, "Ball");
        System.out.println(cat1.getVoice());
        Dog dog1 = new Dog("meat", "dusty grey", 20, "Aport");
        System.out.println(dog1.getVoice());
        Veterinarien veterinarian = new Veterinarien("Doctor Anton");
        veterinarian.treatment(cat1);
        veterinarian.treatment(dog1);
    }
}